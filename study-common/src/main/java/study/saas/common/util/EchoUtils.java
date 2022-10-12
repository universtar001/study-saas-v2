package study.saas.common.util;

import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.service.EchoService;
import study.saas.common.viewmodel.ApiResult;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

public class EchoUtils {


    private static final String ECHO_MESSAGE = "HI";
    // 1. 服务正常
    private static final String SUCCESS_MESSAGE = "1";
    // 2. 服务异常
    private static final String ERROR_MESSAGE = "2";
    // 3. 服务未正常启动
    private static final String NULL_MESSAGE = "3";

    private static final Log log = LogFactory.getLog(EchoUtils.class);

    private static List<String> services;
    static {
        services = new ArrayList<>();

        services.add("admin");
        services.add("article");
//        services.add("boom");
        services.add("boss");
        services.add("course");
        services.add("exam");
        services.add("institute");
        services.add("live");
        services.add("log");
        services.add("media");
        services.add("order");
        services.add("order2nd");
        services.add("party");
        services.add("point");
        services.add("punchclock");
        services.add("recruit");
        services.add("sku");
        services.add("sms");
        services.add("statistics");
        services.add("tenant");
        services.add("user");
        services.add("weixin");
        services.add("wxproxy");
        services.add("event");
        services.add("sports");
        services.add("plugin");
    }

    public static List<String> getServices() {
        return services;
    }

    public static ApiResult echo(Object facade) {
        EchoService echoService = (EchoService) facade;
        if (echoService == null) {
            return ApiResult.ok(NULL_MESSAGE);
        }
        try {
            echoService.$echo(ECHO_MESSAGE);
        } catch (RpcException e) {
            return ApiResult.ok(ERROR_MESSAGE);
        }
        return ApiResult.ok(SUCCESS_MESSAGE);
    }

    public static String strEcho(Object facade) {
        EchoService echoService = (EchoService) facade;
        if (echoService == null) {
            return NULL_MESSAGE;
        }
        try {
            echoService.$echo(ECHO_MESSAGE);
        } catch (RpcException e) {
            return ERROR_MESSAGE;
        }
        return SUCCESS_MESSAGE;
    }

    public static void createEchoLog(String echoName,String serviceName, String serviceState) {
        log.info("[ECHO INFO] (" + serviceName + ") serviceState: " + serviceState);
        if (serviceState.equals(ERROR_MESSAGE) || serviceState.equals(NULL_MESSAGE)) {
            try {
                MailUtil.sendMail(echoName,serviceName,serviceState);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
