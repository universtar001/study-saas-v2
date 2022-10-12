package study.saas.order.repo;

import study.saas.common.repo.BaseRepoV2;
import study.saas.order.entity.Order;

public interface OrderRepo extends BaseRepoV2<Order, String> {

    Order findByOrderId(Integer orderId);
}
