package study.saas.order.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author WMX
 */
@Data
@ApiModel
public class CommodityDecreaseDTO implements Serializable {
    @ApiModelProperty(value = "商品数量")
    private Integer amount;

    @ApiModelProperty(value = "商品名称")
    private String commodityName;

    @ApiModelProperty(value = "商品状态")
    private String Status;
}

