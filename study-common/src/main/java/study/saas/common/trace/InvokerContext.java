/* 版权所有(C)，库米（上海）信息科技有限公司，2019，所有权利保留。
 *
 * 项目名：	dianping.saas.edu.common.trace
 * 文件名：	InvokerContext
 * 模块说明：
 * 修改历史：
 * 2019/8/22 - sunyi - 创建。
 */

package study.saas.common.trace;

/**
 * @author sunyi
 * @date 2019/8/22
 */
public class InvokerContext {
    private static final ThreadLocal<String> URL = new ThreadLocal<>();
    private static final ThreadLocal<String> METHOD = new ThreadLocal<>();
    private static final ThreadLocal<Object> ARGUMENTS = new ThreadLocal<>();

    public static String getUrl() {
        return URL.get();
    }

    public static String getMethod() {
        return METHOD.get();
    }

    public static Object getArguments() {
        return ARGUMENTS.get();
    }

    public static void setUrl(String url) {
        URL.set(url);
    }

    public static void setMethod(String method) {
        METHOD.set(method);
    }

    public static void setArguments(Object arguments) {
        ARGUMENTS.set(arguments);
    }

    public static void clear(){
        URL.remove();
        METHOD.remove();
        ARGUMENTS.remove();
    }
}
