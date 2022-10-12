/* 版权所有(C)，库米（上海）信息科技有限公司，2019，所有权利保留。
 *
 * 项目名：	kumi.saas.edu.common.viewmodel
 * 文件名：	BasePageableFilter
 * 模块说明：
 * 修改历史：
 * 2019/9/17 - sunyi - 创建。
 */

package study.saas.common.viewmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sunyi
 * @date 2019/9/17
 */
@Data
@ApiModel
public abstract class BasePageableFilter implements Serializable {
    @ApiModelProperty(value = "页", name = "page", required = true)
    private Integer page;
    @ApiModelProperty(value = "每页数量", name = "pageSize", required = true)
    private Integer pageSize;
    @ApiModelProperty(value = "排序字段", name = "sortKey")
    private String  sortKey;
    @ApiModelProperty(value = "是否倒叙", name = "desc")
    private boolean desc;
}
