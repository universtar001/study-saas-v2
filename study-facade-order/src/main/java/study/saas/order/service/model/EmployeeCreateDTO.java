/* 版权所有(C)，上海海鼎信息工程股份有限公司，2020，所有权利保留。
 *
 * 项目名：	study.saas.order.service.model
 * 文件名：	EmployeeCreateDTO
 * 模块说明：
 * 修改历史：
 * 2020/2/3 - sunyi - 创建。
 */

package study.saas.order.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sunyi
 * @date 2020/2/3
 */
@Data
@ApiModel
public class EmployeeCreateDTO implements Serializable {

    @ApiModelProperty(value = "雇员ID")
    private Integer id;

    @ApiModelProperty(value = "雇员名称")
    private String name;
}
