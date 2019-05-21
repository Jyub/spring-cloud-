package biao.yu.spring.cloud.controller;

import biao.yu.spring.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/21 16:02
 * @description: 用户Ribbon Controller
 */
@RestController
public class UserRibbonController {

    @Autowired
    private LoadBalancerClient client;

    @Value("${provider.service.name}")
    private String providerServiceName;

    @GetMapping("")
    public String getUser() throws IOException {
        User user = new User();
        user.setId(1L);
        user.setName("literyu");

        ServiceInstance instance = client.choose(providerServiceName);
        return client.execute(providerServiceName,instance,(instance1 -> {
            String host  = instance.getHost();
            int port = instance.getPort();
            String url = "http://"+host+":"+port+"/user/save";
            RestTemplate template = new RestTemplate();
            return template.postForObject(url,user,String.class);
        }));
    }

}
