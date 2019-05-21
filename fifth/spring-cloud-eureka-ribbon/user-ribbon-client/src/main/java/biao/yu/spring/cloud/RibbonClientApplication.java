package biao.yu.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/21 16:19
 * @description: 服务启动点
 */
@SpringBootApplication
@RibbonClients({
        @RibbonClient (name="user-service-provider")
})
public class RibbonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonClientApplication.class);
    }
}
