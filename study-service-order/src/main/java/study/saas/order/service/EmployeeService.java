package study.saas.order.service;

import org.springframework.stereotype.Service;
import study.saas.common.entity.YPageable;
import study.saas.common.repo.Repo;
import study.saas.common.util.CopyClassUtil;
import study.saas.common.util.PageUtils;
import study.saas.common.util.StringUtil;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Employee;
import study.saas.order.repo.EmployeeRepo;
import study.saas.order.service.model.EmployeeCreateDTO;
import study.saas.order.service.model.EmployeeFilterDTO;
import study.saas.order.service.model.EmployeeModifyDTO;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunyi
 */
@Service
public class EmployeeService {
    @Resource
    private EmployeeRepo employeeRepo;

    public ApiResultV2<Employee> get(Integer id) {
        Employee employee = employeeRepo.findFirstById(id);
        if (employee != null && employee.isDelete()) {
            employee = null;
        }
        return ApiResultV2.ok(employee);
    }

    public ApiResultV2 create(EmployeeCreateDTO create) {
        Employee employee = employeeRepo.findFirstById(create.getId());
        if (employee != null && !employee.isDelete()) {
            return ApiResultV2.error("id重复");
        }
        Employee newEmployee;
        if (employee == null) {
            newEmployee = new Employee();
        } else {
            newEmployee = employee;
            newEmployee.setIsDeleted(0);
        }
        CopyClassUtil.copyClass(create, newEmployee);
        employeeRepo.save(newEmployee);
        return ApiResultV2.ok();
    }

    public ApiResultV2 modify(EmployeeModifyDTO modify) {
        Employee employee = employeeRepo.findFirstById(modify.getId());
        if (employee == null || employee.isDelete()) {
            return ApiResultV2.error("雇员不存在");
        }
        CopyClassUtil.copyClass(modify, employee);
        employeeRepo.save(employee);
        return ApiResultV2.ok();
    }

    public ApiResultV2 delete(Integer id) {
        Employee employee = employeeRepo.findFirstById(id);
        if (employee == null || employee.isDelete()) {
            return ApiResultV2.ok();
        }
        employee.setIsDeleted(1);
        employeeRepo.save(employee);
        return ApiResultV2.ok();
    }

    public ApiResultV2<PageModel<Employee>> list(EmployeeFilterDTO filter) {
        YPageable pageable = PageUtils.Ypageable(filter.getPage(), filter.getPageSize());
        StringBuilder sql = new StringBuilder();
        Map<String, Object> param = new HashMap<>();
        sql.append(" select e from Employee e where e.isDeleted = 0 ");
        if (!StringUtil.isEmpty(filter.getNameEq())) {
            sql.append(" and e.name = :getNameEq");
            param.put("getNameEq", filter.getNameEq());
        }
        if (!StringUtil.isEmpty(filter.getNameLike())) {
            sql.append(" and e.name like :getNameLike");
            param.put("getNameLike", "%" + filter.getNameLike() + "%");
        }
        sql.append(" order by e.createTime desc,uuid desc ");
        pageable.setCountSql(Repo.toCountJPql(sql.toString()));
        PageModel<Employee> pageModel = employeeRepo.queryPage(sql.toString(), param, Employee.class, pageable);
        return ApiResultV2.ok(pageModel);
    }
}
