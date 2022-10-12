package study.saas.common.dto;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kris
 * @date 2019-12-02 14:46
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(value = "redis锁")
public class RedisLockDTO implements Serializable {

    private static final long serialVersionUID = 7658320092466446685L;
    @ApiModelProperty(name = "锁")
    private String lockKey;


    @ApiModelProperty(name = "请求标识")
    private String requestId;

    @ApiModelProperty(name = "超期时间")
    private int expireTime;

}
