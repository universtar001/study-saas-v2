/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	ddps-trace
 * 文件名：	TraceIdGenerator.java
 * 模块说明：	
 * 修改历史：
 * 2016-9-28 - zhangyanbo - 创建。
 */
package study.saas.common.trace;

import java.util.UUID;

/**
 * @author sunyi
 */
public class TraceIdGenerator {
  public static String next() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }
}
