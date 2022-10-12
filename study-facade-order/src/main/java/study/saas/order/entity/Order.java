package study.saas.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import study.saas.common.viewmodel.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="ordering",
        indexes = {
                @Index(name = "order_index", columnList = "orderId"),
        })
@ApiModel
public class Order extends BaseEntity {
    @Column
    @ApiModelProperty(value = "订单ID")
    private Integer orderId;

    @Column(length = 32)
    @ApiModelProperty(value = "订单名称")
    private String name;

    @Column
    @ApiModelProperty(value = "订单价格")
    private BigDecimal orderPrice;

    @Column
    @ApiModelProperty(value = "订单总价")
    private BigDecimal sum;

//    public Boolean isDelete() {
//        return isDeleted == 1;
 //   }


}
