package study.saas.order.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Employee;
import study.saas.order.service.EmployeeFacade;
import study.saas.order.service.EmployeeService;
import study.saas.order.service.model.EmployeeCreateDTO;
import study.saas.order.service.model.EmployeeFilterDTO;
import study.saas.order.service.model.EmployeeModifyDTO;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sunyi
 */
@Component("employeeFacade")
@Service(version = "1.0.0")
public class EmployeeFacadeImpl implements EmployeeFacade {

    @Resource
    private EmployeeService service;


    @Override
    public ApiResultV2<Employee> get(Integer id) {
        return service.get(id);
    }

    @Override
    public ApiResultV2 create(EmployeeCreateDTO create) {
        return service.create(create);
    }

    @Override
    public ApiResultV2 modify(EmployeeModifyDTO modify) {
        return service.modify(modify);
    }

    @Override
    public ApiResultV2 delete(Integer id) {
        return service.delete(id);
    }

    @Override
    public ApiResultV2<PageModel<Employee>> list(EmployeeFilterDTO filter) {
        return service.list(filter);
    }

    @Override
    public Employee findOne(Integer id) {
        return null;
    }

    @Override
    public Employee save(Employee entity) {
        return null;
    }

    @Override
    public List<Employee> save(List<Employee> entityList) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
