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
public class CommodityFilterDTO extends BasePageableFilter implements Serializable {
    @ApiModelProperty(value = "商品名称等于")
    private String commodityName;
    @ApiModelProperty(value = "商品名称类似于")
    private String commodityLike;
}
