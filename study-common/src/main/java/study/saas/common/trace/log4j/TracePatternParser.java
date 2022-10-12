/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2016，所有权利保留。
 * <p>
 * 项目名：	ddps-trace
 * 文件名：	TracePatternParser.java
 * 模块说明：
 * 修改历史：
 * 2016-9-28 - zhangyanbo - 创建。
 */
package study.saas.common.trace.log4j;

import com.alibaba.fastjson.JSON;
import study.saas.common.trace.InvokerContext;
import study.saas.common.trace.TraceContext;
import study.saas.common.trace.TraceIdGenerator;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.helpers.PatternConverter;
import org.apache.log4j.helpers.PatternParser;
import org.apache.log4j.spi.LoggingEvent;

/**
 * @author sunyi
 */
public class TracePatternParser extends PatternParser {

    public TracePatternParser(String pattern) {
        super(pattern);
    }

    @Override
    protected void finalizeConverter(char c) {
        if (c == 'z') {
            super.addConverter(new TracePatternConverter());
        } else if (c == 'Z') {
            super.addConverter(new InvokerConverter());
        } else {
            super.finalizeConverter(c);
        }
    }

    public static class TracePatternConverter extends PatternConverter {

        @Override
        protected String convert(LoggingEvent event) {
            return null;
        }

        @Override
        public final void format(StringBuffer sb, LoggingEvent event) {
            if (StringUtils.isBlank(TraceContext.getTraceId())) {
                TraceContext.setTraceId(TraceIdGenerator.next());
            }
            sb.append(TraceContext.getTraceId());
        }
    }

    public static class InvokerConverter extends PatternConverter {

        @Override
        protected String convert(LoggingEvent event) {
            return null;
        }

        @Override
        public final void format(StringBuffer sb, LoggingEvent event) {
            if (event.getLevel().equals(Level.ERROR)) {
                if (StringUtils.isNotBlank(InvokerContext.getUrl())) {
                    sb.append("<url:").append(InvokerContext.getUrl()).append(">");
                }
                if (StringUtils.isNotBlank(InvokerContext.getMethod())) {
                    sb.append("<method:").append(InvokerContext.getMethod()).append(">");
                }
                if (InvokerContext.getArguments() != null) {
                    sb.append("<arguments:").append(JSON.toJSONString(InvokerContext.getArguments())).append(">");
                }
            }
        }
    }
}
