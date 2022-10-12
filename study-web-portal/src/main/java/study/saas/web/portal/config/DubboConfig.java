package study.saas.web.portal.config;

import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.saas.common.util.PropertyUtil;

import java.util.Properties;


/**
 * @author ocean
 * @date 2019-08-28
 */
@Configuration
public class DubboConfig {

    /**
     * 应用配置
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        Properties properties = PropertyUtil.loadProperties("dubbo.properties");
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setQosEnable(false);
        applicationConfig.setName(properties.getProperty("dubbo.application.name"));
        applicationConfig.setEnvironment(properties.getProperty("dubbo.application.environment"));
        return applicationConfig;
    }

    /**
     * * 消费者配置不主动监督zookeeper服务
     */
    @Bean
    public ConsumerConfig consumerConfig() {
        Properties properties = PropertyUtil.loadProperties("dubbo.properties");
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setCheck(Boolean.valueOf(properties.getProperty("dubbo.consumer.check")));
        consumerConfig.setTimeout(Integer.parseInt(properties.getProperty("dubbo.consumer.timeout")));
        consumerConfig.setRetries(Integer.parseInt(properties.getProperty("dubbo.consumer.retries")));
        return consumerConfig;
    }

    /**
     * * 服务端配置不主动监督zookeeper服务
     */
    @Bean
    public ServiceConfig serviceConfig() {
        Properties properties = PropertyUtil.loadProperties("dubbo.properties");
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setTimeout(Integer.parseInt(properties.getProperty("dubbo.service.timeout")));
        serviceConfig.setRetries(Integer.parseInt(properties.getProperty("dubbo.service.retries")));
        return serviceConfig;
    }

    /**
     * 配置中心
     */
    @Bean
    public RegistryConfig registryConfig() {
        Properties properties = PropertyUtil.loadProperties("dubbo.properties");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(properties.getProperty("dubbo.registry.address"));
        registryConfig.setProtocol(properties.getProperty("dubbo.registry.protocol"));
        return registryConfig;
    }

    /**
     * 协议配置
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(-1);
        return protocolConfig;
    }

}
