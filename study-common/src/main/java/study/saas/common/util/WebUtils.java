package study.saas.common.util;

import study.saas.common.enumutil.ExceptionEnum;
import study.saas.common.enumutil.UserIdentityEnum;
import study.saas.common.exceptions.DescribeException;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author basilwang on 2017-03-02.
 */
public class WebUtils {

    private static final Logger logger = LoggerFactory
            .getLogger(WebUtils.class);

    public static Integer getLoginUserId() {
        Integer userId = null;
        try {
            userId = Integer.valueOf(ThreadContext.get(Constant.USERID).toString());
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_USERINFO);
        }
        return userId;
    }

    public static void setLoginUserId(Integer loginUserId) {

        ThreadContext.put(Constant.USERID, loginUserId);
    }

    public static Integer getIdentity() {
        Integer Identity = 0;
        try {
            Identity = Integer.valueOf(ThreadContext.get(Constant.IDENTITY).toString());
        } catch (Exception e) {
            //如果报错就当普通人即可(Identity为0)
        }
        return Identity;
    }

    public static void setIdentity(UserIdentityEnum userIdentityEnum) {

        ThreadContext.put(Constant.IDENTITY, userIdentityEnum.getCode());
    }

    /**
     * boos管理端查询adminKeyId，后台没有把它封进去
     *
     * @return
     */
    public static Integer getLoginAdminId() {
        Integer adminId = null;
        try {
            adminId = Integer.valueOf(ThreadContext.get(Constant.ADMINID).toString());
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_ADMINID);
        }
        return adminId;
    }

    public static void setLoginAdminId(Integer loginAdminId) {

        ThreadContext.put(Constant.ADMINID, loginAdminId);
    }

    public static String getOpenId() {
        String openId = null;
        try {
            openId = ThreadContext.get(Constant.OPEN_ID).toString();
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_OPENID);
        }
        return openId;
    }

    public static void setOpenId(String openId) {

        ThreadContext.put(Constant.OPEN_ID, openId);
    }

    public static void setTenantId(String tenantId) {
        setSession(Constant.TenantId, tenantId);
    }

    public static void setProductPin(String productPin) {
        setSession(Constant.ProductPin, productPin);
    }

    public static final String getTenantId() {
        String tenantId = null;
        try {
            Subject currentUser = SecurityUtils.getSubject();
            if (null != currentUser) {
                Session session = currentUser.getSession();
                if (null != session) {
                    //加入这个判断是如果缓存中没有该用户信息的时候，系统会给你自动拟一个不带有任何用户信息的异常，所以需要对用户信息进行判空处理
                    if (null == session.getAttribute(Constant.CURRENT_USER)) {
                        return null;
//                        throw new InvalidSessionException();
                    }
                    tenantId = (String) session.getAttribute(Constant.TenantId);
                }
            }
        } catch (InvalidSessionException e) {
//            logger.error("InvalidSessionException", e);
            throw e;
        } catch (Exception e) {
            tenantId = bossGetTenantId();
        }
        return tenantId;
    }

    private static final String bossGetTenantId() {
        try {
            return ThreadContext.get("TenantId").toString();
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_TENANTID);
        }
    }

    public static final String getProductPin() {
        String productPin = null;
        try {
            Subject currentUser = SecurityUtils.getSubject();
            if (null != currentUser) {
                Session session = currentUser.getSession();
                if (null != session) {
                    //加入这个判断是如果缓存中没有该用户信息的时候，系统会给你自动拟一个不带有任何用户信息的异常，所以需要对用户信息进行判空处理
                    if (null == session.getAttribute(Constant.CURRENT_USER)) {
                        throw new InvalidSessionException();
                    }
                    productPin = (String) session.getAttribute(Constant.ProductPin);
                }
            }
        } catch (InvalidSessionException e) {
//            logger.error("InvalidSessionException ", e);
            throw e;
        } catch (Exception e) {
            productPin = bossGetProductPin();
        }
        return productPin;
    }

    private static final String bossGetProductPin() {
        try {
            return ThreadContext.get("ProductPin").toString();
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_TENANTID);
        }
    }

    public static String getIpAddress(HttpServletRequest request) {

        String ipAddress = request.getHeader("x-forwarded-for");

        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknow".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();

            if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
                //根据网卡获取本机配置的IP地址
                InetAddress inetAddress = null;
                try {
                    inetAddress = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress = inetAddress.getHostAddress();
            }
        }

        //对于通过多个代理的情况，第一个IP为客户端真实的IP地址，多个IP按照','分割
        if (null != ipAddress && ipAddress.length() > 15) {
            //"***.***.***.***".length() = 15
            if (ipAddress.indexOf(",") > 0) {
                ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
            }
        }

        return ipAddress;
    }

    /**
     * 保存当前用户
     */
    public static final void saveCurrentUser(Object user) {
        setSession(Constant.CURRENT_USER, user);
    }

    /**
     * 保存当前用户
     */
    public static final void saveCurrentUser(HttpServletRequest request, Object user) {
        setSession(request, Constant.CURRENT_USER, user);
    }

    /**
     * 获取当前用户
     * portal获取当前用户的账号(手机号)
     *
     * @return
     */
    public static final String getCurrentUser() {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            if (null != session) {
                //加入这个判断是如果缓存中没有该用户信息的时候，系统会给你自动拟一个不带有任何用户信息的异常，所以需要对用户信息进行判空处理
                String phone = (String) session.getAttribute(Constant.CURRENT_USER);
                if (null == phone) {
                    return null;
//                    throw new InvalidSessionException();//出现这个异常的时候，系统将会报401
                } else {
                    return phone;
                }
            }
        }
        return null;
    }

    /**
     * 获取当前用户
     */
    public static final Object getCurrentUser(HttpServletRequest request) {
        try {
            HttpSession session = request.getSession();
            if (null != session) {
                return session.getAttribute(Constant.CURRENT_USER);
            }
        } catch (InvalidSessionException e) {
            logger.error("InvalidSessionException", e);
        }
        return null;
    }

    /**
     * 将一些数据放到ShiroSession中,以便于其它地方使用
     * <p>
     * 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
     */
    public static final void setSession(Object key, Object value) {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession(true);
            if (null != session) {
                session.setAttribute(key, value);
                session.setTimeout(28800000);
            }
        }
    }

    /**
     * 移除一些放到ShiroSession中的数据,以便于其它地方使用
     */
    public static final void removeSession(Object key) {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            if (null != session) {
                session.removeAttribute(key);
            }
        }
    }

    /**
     * 将一些数据放到ShiroSession中,以便于其它地方使用
     * <p>
     * 比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到
     */
    public static final void setSession(HttpServletRequest request, String key, Object value) {
        HttpSession session = request.getSession();
        if (null != session) {
            session.setAttribute(key, value);
        }
    }

    /**
     * 通过前段请求头获取ip
     */
    public static final void setIp(String ip) {
        try {
            ThreadContext.put("IPAddress", ip);
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_TENANTID);
        }
    }

    /**
     * 通过前段请求头获取ip
     */
    public static final String getIp() {
        try {
            return (String) ThreadContext.get("IPAddress");
        } catch (Exception e) {
            throw new DescribeException(ExceptionEnum.MISS_TENANTID);
        }
    }

    /**
     * 通过请求头获取平台Id
     */
    public static String getHeaderService(HttpServletRequest request) {
        String callerService = request.getHeader("KUMI-Caller-Service");
        if (StringUtil.isEmpty(callerService)) {
            return "NULL";
        } else {
            return callerService;
        }
    }

    /**
     * 设置平台Id
     */
    public static final void setCallerService(String callerService) {
        setSession(Constant.CALLER_SERVICE, callerService);
    }

    /**
     * 获取平台Id
     */
    public static final String getCallerService() {
        String callerService = null;
        try {
            Subject currentUser = SecurityUtils.getSubject();
            if (null != currentUser) {
                //获取不到session会重新创建session
                Session session = currentUser.getSession(true);
                if (null != session) {
                    //加入这个判断是如果缓存中没有该用户信息的时候，系统会给你自动拟一个不带有任何用户信息的异常，所以需要对用户信息进行判空处理
                    if (null == session.getAttribute(Constant.CURRENT_USER)) {
                        return "NULL";
                    }
                    callerService = (String) session.getAttribute(Constant.CALLER_SERVICE);
                }
            }
        } catch (InvalidSessionException e) {
            throw e;
        } catch (Exception e) {
            callerService = StringUtil.isEmpty((String) ThreadContext.get(Constant.CALLER_SERVICE)) ? "NULL" : (String) ThreadContext.get(Constant.CALLER_SERVICE);
        }
        return callerService;
    }

    /**
     * 设置是否是代理商 0普通租户 1运营者 2代理商
     */
    public static final void setIfOperator(Integer ifOperator) {
        setSession(Constant.IFOPERATOR, ifOperator);
    }

    /**
     * 获取是否是代理商 0普通租户 1运营者 2代理商
     */
    public static final Integer getIfOperator() {
        Integer ifOperator = 0;
        try {
            Subject currentUser = SecurityUtils.getSubject();
            if (null != currentUser) {
                Session session = currentUser.getSession();
                if (null != session) {
                    //加入这个判断是如果缓存中没有该用户信息的时候，系统会给你自动拟一个不带有任何用户信息的异常，所以需要对用户信息进行判空处理
                    if (null == session.getAttribute(Constant.CURRENT_USER)) {
                        return null;
                    }
                    ifOperator = (Integer) session.getAttribute(Constant.IFOPERATOR);
                }
            }
        } catch (InvalidSessionException e) {
            throw e;
        } catch (Exception e) {
            ifOperator = (Integer) ThreadContext.get(Constant.IFOPERATOR);
        }
        return ifOperator;
    }
}
