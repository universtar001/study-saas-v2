package study.saas.common.filter;


import study.saas.common.util.Constant;
import study.saas.common.util.DigestUtil;
import org.apache.shiro.util.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Peter on 2017-03-02.
 */
public class ApiAuthenticatingFilter implements Filter {

    private static final Logger logger = LoggerFactory
            .getLogger(ApiAuthenticatingFilter.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(request, response);

//        String url = ((HttpServletRequest) request).getRequestURL().toString();
//        //如果是登陆或注册的url,则不需要验证身份
//        if (url.contains("login") || url.contains("register") || url.contains("authenticWeb") || url.contains("checkUserSignal") ) {
////        if (true) {
//            chain.doFilter(request, response);
//            return;
//        }
//
//        //获取验证身份的token
//        String authHeader = getAuthHeader(request);
//        if (!StringUtils.isEmpty(authHeader)) {
//            String[] principals = getPrincipalsAndCredentials(authHeader);
//            if (null == principals)
//                return;
//            Integer userId = Integer.valueOf(principals[0]);
//            logger.warn("customerId" + userId);
//            ThreadContext.put(Constant.USERID, userId);
//
//            logger.warn("customerId" + userId);
//
//            chain.doFilter(request, response);
//        } else {
//            ((HttpServletResponse) response).setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            response.getWriter().write(JSONUtils.toJsonString(ApiError.unLogin()));
//        }

    }

    @Override
    public void destroy() {
        ThreadContext.remove(Constant.USERID);

    }

    protected String[] getPrincipalsAndCredentials(String authorizationHeader) {
        String[] authTokens = authorizationHeader.split(" ");
        String token;
        if (authTokens.length>1) {
            token = authTokens[1];
        }else{
            return null;
        }
        String decoded = DigestUtil.Decrypt(token);
        if (decoded.contains(":")){
            return decoded.split(":", 2);
        }else{
            return decoded.split(":", 1);
        }
    }


    private String getAuthHeader(ServletRequest request) {
        String authHeader = ((HttpServletRequest) request).getHeader(Constant.Authorization);
        if (StringUtils.isEmpty(authHeader)) {
            authHeader = "Basic 8454a9098e7399dda8516b6aa8bd335f97e99fc0639ca75bac30c33382b3f69d";
        }


        return authHeader;
    }
}
