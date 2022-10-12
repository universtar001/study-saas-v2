package study.saas.order.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import study.saas.common.viewmodel.BaseEntity;
import study.saas.common.viewmodel.BaseObject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.math.BigDecimal;


@Data
@Entity
@Table(name = "commodity",indexes = {
        @Index(name = "commodityName_index",columnList = "commodityName")
})
@ApiModel
public class Commodity extends BaseEntity {

    @Column
    @ApiModelProperty(value = "商品数量")
    private Integer amount;

    @Column
    @ApiModelProperty(value = "商品名称")
    private String commodityName;

    @Column
    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;

    @Column
    @ApiModelProperty(value = "商品状态")
    private Integer status;

//    public boolean isDelete() {
//        return false;
//    }
}
