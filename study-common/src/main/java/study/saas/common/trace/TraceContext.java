/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	ddps-trace
 * 文件名：	TraceContext.java
 * 模块说明：	
 * 修改历史：
 * 2016-9-28 - zhangyanbo - 创建。
 */
package study.saas.common.trace;

/**
 * trace上下文
 * 
 * @author sunyi
 * 
 */
public class TraceContext {
  public static final String TRACEID = "trace_id";

  private static final ThreadLocal<String> CONTEXT = new ThreadLocal<String>();

  public static String getTraceId() {
    return CONTEXT.get();
  }

  public static void setTraceId(String traceId) {
    CONTEXT.set(traceId);
  }

  public static void clear(){
    CONTEXT.remove();
  }
}
