package study.saas.common.filter;

import study.saas.common.util.SignConvertUtil;
import study.saas.common.util.StringUtil;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Paul
 * @Title: AuthenticationDataFilter
 * @Description: 对外接口鉴权信息验证
 * @date 2019/8/26
 */
public class AuthenticationDataFilter implements Filter {

    private final long SECONDS = 300;
    /**
     * 签名
     */
    private final String CALLER_SIGN = "X-Caller-Sign";
    /**
     * 调用服务名称（此名称由库米提供给调用方，默认kumi-call-service/shuyun-call-service）
     */
    private final String CALLER_SERVICE = "X-Caller-Service";
    /**
     * 时间戳（格式：yyyy-MM-dd HH:mm:ss）
     */
    private final String CALLER_TIMESTAMP = "X-Caller-Timestamp";
    /**
     * 调用服务密钥（此密钥由库米提供给调用方）
     */
    private final String SERVICE_SECRET = "a9b12baa28a506fd";

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final org.apache.commons.logging.Log log = LogFactory.getLog(AuthenticationDataFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        // 获取请求的uri
        String requestUri = request.getRequestURI();
        // 检查请求投中是否携带鉴权信息
        String callerSign = request.getHeader(CALLER_SIGN);
        String callerService = request.getHeader(CALLER_SERVICE);
        String callerTimeStamp = request.getHeader(CALLER_TIMESTAMP);
        if (StringUtil.isEmpty(callerSign) || StringUtil.isEmpty(callerService) || StringUtil.isEmpty(callerTimeStamp)) {
            log.info("鉴权过滤器=（AuthenticationDataFilter）=请求头中鉴权信息缺失！！！");
            // 返回错误信息
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print("{\"code\": \"00001\",\"message\": \"鉴权信息缺失\"}");
            response.getWriter().close();
            return;
        }
        // 检查时间戳是否超时
        if (checkTimeStamp(callerTimeStamp)) {
            log.info("鉴权过滤器=（AuthenticationDataFilter）=时间戳超时，请求头中时间戳打印=" + callerTimeStamp);
            // 返回错误信息
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print("{\"code\": \"00002\",\"message\": \"时间戳超时\"}");
            response.getWriter().close();
            return;
        }
        // 获取url中的参数值
        String[] parameterArr = requestUri.split("/", -1);
        String contextPath = parameterArr[1];
        String version = parameterArr[2];
        // uri占位符
        String uriPlaceholder = new StringBuilder().append("/").append(contextPath).append("/").append(version).toString();
        String requestPath = requestUri.replace(uriPlaceholder, "");
        // 检查鉴权参数是否正确
        log.info("鉴权过滤器=（AuthenticationDataFilter）=参数打印，callerService=" + callerService + "，contextPath=" + contextPath + "，version=" + version + "，timestamp=" + callerTimeStamp + "，requestPath=" + requestPath);
        String sign = SignConvertUtil.generateSign(callerService, contextPath, version, callerTimeStamp, SERVICE_SECRET, requestPath);
        if (!callerSign.equals(sign)) {
            log.info("鉴权过滤器=（AuthenticationDataFilter）=签名错误，请求头中的签名打印=" + callerSign + "，生成的签名=" + sign);
            // 返回错误信息
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().print("{\"code\": \"00003\",\"message\": \"鉴权签名验证失败\"}");
            response.getWriter().close();
            return;
        }
        // 进入接口
        log.info("鉴权过滤器=（AuthenticationDataFilter）=鉴权校验成功！！！");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    /**
     * 检查时间戳是否超过5分钟
     *
     * @param timeStamp 时间戳（格式：yyyy-MM-dd HH:mm:ss）
     * @return
     */
    private Boolean checkTimeStamp(String timeStamp) {
        // 当前时间
        LocalDateTime nowTime = LocalDateTime.now();
        LocalDateTime parameterTime = LocalDateTime.parse(timeStamp, formatter);
        // 检查时间间隔
        Duration duration = Duration.between(parameterTime, nowTime);
        long seconds = duration.getSeconds();
        if (seconds > SECONDS) {
            return true;
        }
        return false;
    }

    @Override
    public void destroy() {

    }

}
