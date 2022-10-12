package study.saas.web;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.velocity.VelocityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.support.ErrorPageFilter;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import study.saas.common.filter.AuthenticationDataFilter;
import study.saas.common.filter.CrossOriginFilter;
import study.saas.common.trace.filter.WebTraceFilter;

import javax.servlet.Filter;

/**
 * @Author:Stalary
 * @Description:
 * @Date Created in 下午6:07 17/7/25
 */
//TODO 注解查看，spring-boot + spring MVC + Dubbo
@SpringBootApplication(exclude = {FreeMarkerAutoConfiguration.class, VelocityAutoConfiguration.class, DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@Import({ActiveMqConfig.class, RedisCacheConfig.class})
@DubboComponentScan
@PropertySource(value = {"classpath:application.properties"})
public class PortalApplication extends SpringBootServletInitializer {

    @Value("${cors.allow.origin}")
    private String allowOrigin;

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(PortalApplication.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }

    //TODO 错误页面Filter
    @Bean
    public ErrorPageFilter errorPageFilter() {
        return new ErrorPageFilter();
    }

    @Bean
    public FilterRegistrationBean disableSpringBootErrorFilter(ErrorPageFilter filter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(filter);
        filterRegistrationBean.setEnabled(false);
        return filterRegistrationBean;
    }

    //TODO 跨域Filter
    @Bean
    public FilterRegistrationBean crossOriginFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(crossOriginFilter());
        registration.addUrlPatterns("*");
        registration.setName("crossOriginFilter");
        registration.addInitParameter("allowOrigin", allowOrigin);
        registration.setOrder(1);
        return registration;
    }

    //TODO 跨域Filter
    @Bean(name = "crossOriginFilter")
    public Filter crossOriginFilter() {
        return new CrossOriginFilter();
    }

    //TODO traceId微服务跟踪Filter
    @Bean
    public FilterRegistrationBean traceFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new WebTraceFilter());
        return registration;
    }

    //TODO 权限认证Filter
    @Bean
    public FilterRegistrationBean authenticationDataFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 指定过滤的url
        registration.addUrlPatterns("/kumi-external/v1/*");
//        registration.addUrlPatterns("/shuyun-external/v1/*");
        registration.setName("authenticationDataFilter");
        registration.addInitParameter("allowOrigin", allowOrigin);
        registration.setFilter(new AuthenticationDataFilter());
        return registration;
    }

    //TODO
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PortalApplication.class);
    }

    //TODO Jackson ,JSON转化的配置类
    @Autowired(required = true)
    public void configeJackson(ObjectMapper jackson2ObjectMapper) {
        jackson2ObjectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        jackson2ObjectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }
}

