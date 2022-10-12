/* 版权所有(C)，库米（上海）信息科技有限公司，2019，所有权利保留。
 *
 * 项目名：	dianping.saas.edu.common.trace
 * 文件名：	WebTraceFilter
 * 模块说明：
 * 修改历史：
 * 2019/8/22 - sunyi - 创建。
 */

package study.saas.common.trace.filter;

import study.saas.common.trace.InvokerContext;
import study.saas.common.trace.TraceContext;
import study.saas.common.trace.TraceIdGenerator;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunyi
 * @date 2019/8/22
 */
public class WebTraceFilter implements Filter {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        InvokerContext.setUrl(req.getRequestURI());
        Enumeration<String> parameterNames = request.getParameterNames();
        Map<String, String> parameterMap = new HashMap<>(request.getParameterMap().size());
        while (parameterNames.hasMoreElements()) {
            String parameter = parameterNames.nextElement();
            parameterMap.put(parameter, request.getParameter(parameter));
        }
        ServletRequest requestWrapper = null;
        if ("POST".equalsIgnoreCase(req.getMethod())) {
             requestWrapper = new BodyReaderHttpServletRequestWrapper(req);
            String body = BodyReaderHttpServletRequestWrapper.getBodyString(requestWrapper);
            parameterMap.put("body", body);
        }
        InvokerContext.setArguments(parameterMap);
        String traceId = req.getHeader(TraceContext.TRACEID);
        if (StringUtils.isEmpty(traceId)) {
            traceId = TraceIdGenerator.next();
            TraceContext.setTraceId(traceId);
        } else {
            TraceContext.setTraceId(traceId);
        }
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader(TraceContext.TRACEID, TraceContext.getTraceId());
        if (requestWrapper != null) {
            chain.doFilter(requestWrapper, response);
        }else{
            chain.doFilter(request, response);
        }
        TraceContext.clear();

    }

    @Override
    public void destroy() {
    }
}
