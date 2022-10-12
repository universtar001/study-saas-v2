package study.saas.order.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import study.saas.common.viewmodel.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
/**
 * 这是实体类，放在entity中
 * @author RivenChen
 */
@Data
@Entity
@Table(name="employee",
        indexes = {
                @Index(name = "id_index", columnList = "id"),
             })
@ApiModel
public class Employee extends BaseEntity {

    @Column
    @ApiModelProperty(value = "雇员ID")
    private Integer id;

    @Column(length = 32)
    @ApiModelProperty(value = "雇员名称")
    private String name;

}
