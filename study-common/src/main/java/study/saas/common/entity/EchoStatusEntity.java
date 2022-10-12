package study.saas.common.entity;

import java.io.Serializable;

/**
 * 微服务状态实体类
 */
public class EchoStatusEntity implements Serializable{

    private String serviceName;
    private Integer serviceStatus;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
}
