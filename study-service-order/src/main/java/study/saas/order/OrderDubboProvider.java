package study.saas.order;


import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import study.saas.common.repo.BaseRepoImpl;


/**
 * @Author:Stalary
 * @Description:
 * @Date Created in 下午6:07 17/7/25
 */
@EnableJpaAuditing
@SpringBootApplication
//@Import({RedisCacheConfig.class})
@DubboComponentScan
@EnableJpaRepositories(basePackages = "study.saas.order.**.repo", repositoryBaseClass = BaseRepoImpl.class)
@EnableCaching
public class OrderDubboProvider implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderDubboProvider.class);

    public static void main(String[] args) {
        try {
            SpringApplication springApplication =
                    new SpringApplicationBuilder()
                            .sources(OrderDubboProvider.class)
                            .web(false)
                            .build();
            springApplication.run(args);
        } catch (Exception e) {
            LOGGER.error("== DubboProvider context start error:", e);
        }
        synchronized (OrderDubboProvider.class) {
            while (true) {
                try {
                    OrderDubboProvider.class.wait();
                } catch (InterruptedException e) {
                    LOGGER.error("== synchronized error:", e);
                }
            }
        }
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("跑起来了,冲冲冲:");
    }
}



