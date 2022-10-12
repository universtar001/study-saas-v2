/* 版权所有(C)，库米（上海）信息科技有限公司，2019，所有权利保留。
 *
 * 项目名：	dianping.saas.edu.common.trace
 * 文件名：	DubboTraceFilter
 * 模块说明：
 * 修改历史：
 * 2019/8/22 - sunyi - 创建。
 */

package study.saas.common.trace.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import study.saas.common.trace.InvokerContext;
import study.saas.common.trace.TraceContext;
import study.saas.common.trace.TraceIdGenerator;
import org.apache.commons.lang3.StringUtils;

/**
 * @author sunyi
 * @date 2019/8/22
 */
@Activate(group = {Constants.PROVIDER, Constants.CONSUMER})
public class DubboTraceFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        RpcContext rpcContext = RpcContext.getContext();
        String traceId = "";
        if (rpcContext.isConsumerSide()) {
            if (StringUtils.isBlank(TraceContext.getTraceId())) {
                // 根调用，生成TraceId
                traceId = TraceIdGenerator.next();
            } else {
                // 后续调用，从Rpc上下文取出并设置到线程上下文
                traceId = TraceContext.getTraceId();
            }
            TraceContext.setTraceId(traceId);
            RpcContext.getContext().setAttachment(TraceContext.TRACEID, TraceContext.getTraceId());
        }
        if (rpcContext.isProviderSide()) {
            // 服务提供方，从Rpc上下文获取traceId
            traceId = RpcContext.getContext().getAttachment(TraceContext.TRACEID);
            TraceContext.setTraceId(traceId);
            InvokerContext.setMethod(invocation.getMethodName());
            InvokerContext.setArguments(invocation.getArguments());
        }
        Result result = invoker.invoke(invocation);
        return result;
    }
}
