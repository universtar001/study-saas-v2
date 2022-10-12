package study.saas.web.portal.sys.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.order.entity.Commodity;
import study.saas.order.entity.Order;
import study.saas.order.service.OrderFacade;
import study.saas.order.service.model.OrderCreateDTO;
import study.saas.order.service.model.OrderFilterDTO;

import static org.apache.zookeeper.ZooDefs.OpCode.create;

/**
 * @author WMX
 */
@Api(tags = "订单管理")
@RestController
@RequestMapping(value = "sys/order")
public class OrderController {

    @Reference(version = "1.0.0")
    private OrderFacade orderFacade;

    @ApiOperation(value = "下单")
    @RequestMapping(value = "/addOrder", method = RequestMethod.GET)
    public ApiResultV2 addOrder(OrderCreateDTO create) {
        if (create == null ) {
            return ApiResultV2.error("数据不能为空！");
        }
        return orderFacade.addOrder(create);
    }

    //订单查询
    @ApiOperation(value = "获取")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ApiResultV2<Order>findOrder(Integer orderId) {
        if (orderId == null ) {
            return ApiResultV2.error("数据不能为空！");
        }

        return orderFacade.findOrder(orderId);
    }

    //订单结果展示
    @ApiOperation(value = "订单结果展示")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ApiResultV2 list(OrderFilterDTO filter) {
        if (filter == null) {
            return ApiResultV2.error("订单数据不能为空！");
        }
        return orderFacade.list(filter);
    }


}
