package study.saas.order.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Order;
import study.saas.order.service.OrderFacade;
import study.saas.order.service.OrderService;
import study.saas.order.service.model.OrderCreateDTO;
import study.saas.order.service.model.OrderFilterDTO;

import javax.annotation.Resource;
import java.util.List;

@Component("orderFacade")
@Service(version = "1.0.0")
public class OrderFacadeImpl implements OrderFacade {
    @Resource
    private OrderService service;

    @Override
    public ApiResultV2 addOrder(OrderCreateDTO create) {
        return service.addOrder(create);
    }

    @Override
    public ApiResultV2<Order> findOrder(Integer orderId) {
        return  service.findOrder(orderId);
    }

    @Override
    public ApiResultV2<PageModel<Order>> list(OrderFilterDTO filter) {
        return service.list(filter);
    }

    @Override
    public Order findOne(Integer orderId) {
        return null;
    }

    @Override
    public Order save(Order entity) {
        return null;
    }

    @Override
    public List<Order> save(List<Order> entityList) {
        return null;
    }

    @Override
    public void deleteById(Integer orderId) {

    }

}
