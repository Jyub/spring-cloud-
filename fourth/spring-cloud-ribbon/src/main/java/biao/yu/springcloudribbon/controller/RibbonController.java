package biao.yu.springcloudribbon.controller;

import biao.yu.springcloudribbon.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/16 17:52
 * @description: 服务提供congtroller
 */
@RestController
public class RibbonController {

    private RestTemplate restTemplate;

    @Value("${server.provider.host}")
    private String host;
    @Value("${server.provider.port}")
    private String port;
    @Value("${server.provider.name}")
    private String name;

    @Autowired
    public RibbonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getMeg")
    public String getMeg(){
        Person per = new Person();
        per.setId(1L);
        per.setName("于彪");
        return restTemplate.postForObject("http://"+name+"/greeting",per,String.class);
    }
}
