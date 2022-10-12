package study.saas.order.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import study.saas.common.util.PropertyUtil;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

/**
 * druid配置
 *
 * @author ocean
 * @date 2019-02-19
 */
@Configuration
public class DruidConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DruidConfig.class);

    @Bean(name = "druid.dataSource")
    public DataSource druidDataSource() {
        Properties properties = PropertyUtil.loadProperties("druid.properties");
        String dataUrl = properties.getProperty("druid.spring.datasource.base.url");
        String userName = properties.getProperty("druid.spring.datasource.username");
        String password = properties.getProperty("druid.spring.datasource.password");
        String driverClassName = properties.getProperty("druid.spring.datasource.driverClassName");
        Integer initialSize = Integer.valueOf(properties.getProperty("druid.spring.datasource.initialSize"));
        Integer minIdle = Integer.valueOf(properties.getProperty("druid.spring.datasource.minIdle"));
        Integer maxActive = Integer.valueOf(properties.getProperty("druid.spring.datasource.maxActive"));
        Integer maxWait = Integer.valueOf(properties.getProperty("druid.spring.datasource.maxWait"));
        Long timeBetweenEvictionRunsMillis = Long.valueOf(properties.getProperty("druid.spring.datasource.timeBetweenEvictionRunsMillis"));
        Long minEvictableIdleTimeMillis = Long.valueOf(properties.getProperty("druid.spring.datasource.minEvictableIdleTimeMillis"));
        String validationQuery = properties.getProperty("druid.spring.datasource.validationQuery");
        Boolean testWhileIdle = Boolean.valueOf(properties.getProperty("druid.spring.datasource.testWhileIdle"));
        Boolean testOnBorrow = Boolean.valueOf(properties.getProperty("druid.spring.datasource.testOnBorrow"));
        Boolean testOnReturn = Boolean.valueOf(properties.getProperty("druid.spring.datasource.testOnReturn"));
        String filters = properties.getProperty("druid.spring.datasource.filters");
        return druidDataSource(dataUrl, userName, password, driverClassName, initialSize, minIdle, maxActive, maxWait, timeBetweenEvictionRunsMillis, minEvictableIdleTimeMillis, validationQuery, testWhileIdle, testOnBorrow, testOnReturn, filters);
    }

    @Bean
    public EntityManagerFactory entityManagerFactory(@Qualifier("druid.dataSource") DataSource dataSource) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);
        vendorAdapter.setShowSql(false);
        vendorAdapter.setDatabase(Database.MYSQL);
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("study.saas.order.entity.**");
        factory.setDataSource(dataSource);
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    public static DataSource druidDataSource(String dataUrl, String userName, String password,
                                             String driverClassName, Integer initialSize,
                                             Integer minIdle, Integer maxActive, Integer maxWait,
                                             long timeBetweenEvictionRunsMillis, long minEvictableIdleTimeMillis,
                                             String validationQuery, Boolean testWhileIdle, Boolean testOnBorrow, Boolean testOnReturn, String filters) {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(dataUrl);
        datasource.setUsername(userName);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        try {
            datasource.setFilters(filters);
        } catch (SQLException e) {
            LOGGER.error("druid configuration initialization filter", e);
        }
        try {
            datasource.getConnection(1000).close();
        } catch (Exception var9) {
            LOGGER.error("无法连接数据库,将关闭这个服务", var9);
            try {
                datasource.close();
            } catch (Exception var7) {
            }
            //关闭该服务
            System.exit(0);
        }
        return datasource;
    }
}
