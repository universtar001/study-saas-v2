package study.saas.order.repo;

import study.saas.common.repo.BaseRepoV2;
import study.saas.order.entity.Employee;

/**
 * @author sunyi
 */
public interface EmployeeRepo extends BaseRepoV2<Employee, String> {

    /**
     * 根据ID查询雇员
     * @param id 雇员ID
     * @return 雇员
     */
    Employee findFirstById(Integer id);
}
