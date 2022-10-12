package study.saas.web.portal.filter;

import study.saas.common.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peter on 2017-03-02.
 */
public class CrossOriginFilter implements Filter {


    private List<String> allowOrigin;
    private static final Logger logger = LoggerFactory
            .getLogger(CrossOriginFilter.class);
    public static final NumberFormat FORMAT = new DecimalFormat("0.000");

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        allowOrigin = Arrays.asList(filterConfig.getInitParameter("allowOrigin").split(","));
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        WebUtils.setIp(WebUtils.getIpAddress(request));

        long begin = System.currentTimeMillis();
        HttpServletResponse response = (HttpServletResponse) res;
        String originHeader = request.getHeader("Origin");
//        if (allowOrigin.contains(originHeader)) {
        response.setHeader("Access-Control-Allow-Origin", originHeader);
//        }
        response.setHeader("Access-Control-Allow-Methods",
                "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept, Authorization, ipAddress, KUMI-Caller-Service");
        chain.doFilter(req, res);


        if (logger.isInfoEnabled()) {
            long end = System.currentTimeMillis();
            BigDecimal processed = new BigDecimal(end - begin)
                    .divide(new BigDecimal(1000));
            String uri = ((HttpServletRequest) req).getRequestURI();
            //login.do 作为负载均衡健康检查的url,打印日志的话,日志量会很大
            if (!uri.equals("/login.do")) {
                logger.info("Processed in {} second(s). URI={}",
                        FORMAT.format(processed), uri);
            }

        }
    }

    @Override
    public void destroy() {

    }
}
