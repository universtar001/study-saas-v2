package study.saas.order.service;

import study.saas.common.facade.BaseFacade;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.common.viewmodel.PageModel;
import study.saas.order.entity.Employee;
import study.saas.order.service.model.EmployeeCreateDTO;
import study.saas.order.service.model.EmployeeFilterDTO;
import study.saas.order.service.model.EmployeeModifyDTO;

/**
 * 雇员接口
 *
 * @author sunyi
 */
public interface EmployeeFacade extends BaseFacade<Employee> {
    /**
     * 获取雇员
     *
     * @param id 雇员ID
     * @return 返回雇员信息
     */
    ApiResultV2<Employee> get(Integer id);

    /**
     * 新建
     *
     * @param create 雇员信息
     * @return 返回操作结果
     */
    ApiResultV2 create(EmployeeCreateDTO create);

    /**
     * 修改
     *
     * @param modify 雇员信息
     * @return 返回操作结果
     */
    ApiResultV2 modify(EmployeeModifyDTO modify);

    /**
     * 删除
     *
     * @param id 雇员ID
     * @return 返回操作结果
     */
    ApiResultV2 delete(Integer id);

    /**
     * 分页查询列表
     *
     * @param filter 过滤条件
     * @return 返回操作结果
     */
    ApiResultV2<PageModel<Employee>> list(EmployeeFilterDTO filter);
}
