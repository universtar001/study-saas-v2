package study.saas.order.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import study.saas.common.viewmodel.BasePageableFilter;

import java.io.Serializable;

/**
 * @author WMX
 */
@Data
@ApiModel
public class OrderFilterDTO extends BasePageableFilter implements Serializable {
    @ApiModelProperty(value = "订单名称等于")
    private String orderName;
    @ApiModelProperty(value = "订单名称类似于")
    private String orderLike;
}
