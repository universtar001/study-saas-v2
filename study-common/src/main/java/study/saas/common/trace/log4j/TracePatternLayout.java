/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * 
 * 项目名：	ddps-trace
 * 文件名：	TracePatternLayout.java
 * 模块说明：	
 * 修改历史：
 * 2016-9-28 - zhangyanbo - 创建。
 */
package study.saas.common.trace.log4j;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.helpers.PatternParser;

/**
 * @author sunyi
 * 
 */
public class TracePatternLayout extends PatternLayout {

  @Override
  protected PatternParser createPatternParser(String pattern) {
    return new TracePatternParser(pattern);
  }
}
