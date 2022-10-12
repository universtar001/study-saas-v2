package study.saas.common.queue;

import lombok.Data;

import java.io.Serializable;

/**
 * @author rocky.maple
 * @date 2019-09-23 17:18
 * MQ 发送父类
 */
@Data
public class BaseQueue implements Serializable {

    /**
     * 平台
     */
    private String projectId;

    /**
     * 租户
     */
    private String tenantId;

    /**
     * 项目
     */
    private String productPin;

    /**
     * 循环次数 默认0
     */
    private Integer cycles = 0;
}
