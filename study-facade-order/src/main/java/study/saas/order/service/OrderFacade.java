package study.saas.order.service;

import study.saas.common.facade.BaseFacade;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Commodity;
import study.saas.order.entity.Order;
import study.saas.order.service.model.CommodityFilterDTO;
import study.saas.order.service.model.OrderCreateDTO;
import study.saas.order.service.model.OrderFilterDTO;

/**
 * 订单接口
 *
 * @author WMX
 */
public interface OrderFacade extends BaseFacade<Order> {
    /**
     * 创建订单
     */
    ApiResultV2 addOrder(OrderCreateDTO create);

    /**
     * 订单查询
     */
    ApiResultV2<Order> findOrder(Integer orderId);

    /**
     * 订单结果查询
     * @param filter 过滤条件
     * @return 返回操作结果
     */
    ApiResultV2<PageModel<Order>> list(OrderFilterDTO filter);
}
