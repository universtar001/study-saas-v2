package study.saas.web.portal.sys.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import study.saas.common.viewmodel.ApiResultV2;
import study.saas.order.entity.Employee;
import study.saas.order.service.EmployeeFacade;
import study.saas.order.service.model.EmployeeCreateDTO;
import study.saas.order.service.model.EmployeeFilterDTO;
import study.saas.order.service.model.EmployeeModifyDTO;


/**
 * @author RivenChen
 */
@Api(tags = "雇员管理")
@RestController
@RequestMapping(value = "sys/employee")
public class EmployeeController {

    @Reference(version = "1.0.0")
    private EmployeeFacade employeeFacade;

    @ApiOperation(value = "获取")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ApiResultV2<Employee> get(Integer id) {
        if (id == null ) {
            return ApiResultV2.error("数据不能为空！");
        }

        return employeeFacade.get(id);
    }

    @ApiOperation(value = "创建")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ApiResultV2 create(EmployeeCreateDTO create) {
        if (create == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return employeeFacade.create(create);
    }

    @ApiOperation(value = "修改")
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public ApiResultV2 modify(EmployeeModifyDTO modify) {
        if (modify == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return employeeFacade.modify(modify);
    }
    @ApiOperation(value = "删除")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ApiResultV2 delete(Integer id) {
        if (id == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return employeeFacade.delete(id);
    }
    @ApiOperation(value = "分页查询")
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public ApiResultV2 list(EmployeeFilterDTO filter) {
        if (filter == null) {
            return ApiResultV2.error("数据不能为空！");
        }
        return employeeFacade.list(filter);
    }


}
