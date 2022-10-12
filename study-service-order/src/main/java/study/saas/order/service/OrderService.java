package study.saas.order.service;

import org.springframework.stereotype.Service;
import study.saas.common.entity.YPageable;
import study.saas.common.repo.Repo;
import study.saas.common.util.CopyClassUtil;
import study.saas.common.util.PageUtils;
import study.saas.common.util.StringUtil;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Commodity;
import study.saas.order.entity.Order;
import study.saas.order.repo.OrderRepo;
import study.saas.order.service.model.OrderCreateDTO;
import study.saas.order.service.model.OrderFilterDTO;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WMX
 */
@Service
public class OrderService {

    @Resource
    private OrderRepo orderRepo;

    /**
     * 增加商品，下单
     */
    public ApiResultV2 addOrder(OrderCreateDTO create) {
        Order order = orderRepo.findByOrderId(create.getOrderId());
        if (order != null && !order.isDelete()) {
            return ApiResultV2.error("订单id重复");
        }
        Order newOrder;
        if (order == null) {
            newOrder = new Order();
        } else {
            newOrder = order;
            newOrder.setIsDeleted(0);
        }
        CopyClassUtil.copyClass(create, newOrder);
        orderRepo.save(newOrder);
        return ApiResultV2.ok();
    }

    /**
     * 查询商品
     */
    public ApiResultV2<Order> findOrder(Integer orderId) {
        Order order = orderRepo.findByOrderId(orderId);
        if (order != null && order.isDelete()) {
            order = null;
        }
        return ApiResultV2.ok(order);
    }

    /**
     * 订单结果展示
     */
    public ApiResultV2<PageModel<Order>> list(OrderFilterDTO filter) {
        YPageable pageable = PageUtils.Ypageable(filter.getPage(), filter.getPageSize());
        StringBuilder sql = new StringBuilder();
        Map<String, Object> param = new HashMap<>();
        sql.append(" select o from Order o where o.isDeleted = 0 ");
        if (!StringUtil.isEmpty(filter.getOrderName())) {
            sql.append(" and o.orderName = :getOrderName");
            param.put("getOrderName", filter.getOrderName());
        }
        if (!StringUtil.isEmpty(filter.getOrderLike())) {
            sql.append(" and o.orderLike like :getOrderLike");
            param.put("getOrderLike", "%" + filter.getOrderLike() + "%");
        }
        sql.append(" order by o.createTime desc,uuid desc ");
        pageable.setCountSql(Repo.toCountJPql(sql.toString()));
        PageModel<Order> pageModel = orderRepo.queryPage(sql.toString(), param, Order.class, pageable);
        return ApiResultV2.ok(pageModel);
    }
}
