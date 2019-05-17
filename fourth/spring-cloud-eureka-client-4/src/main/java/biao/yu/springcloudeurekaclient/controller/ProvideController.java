package biao.yu.springcloudeurekaclient.controller;

import biao.yu.springcloudeurekaclient.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/16 17:52
 * @description: 服务提供congtroller
 */
@RestController
public class ProvideController {

    @Value("${server.port}")
    private String port;

    @PostMapping("/greeting")
    public String greeting(@RequestBody Person person){
        return "Greeting  "+person.toString()+"   port:"+port;
    }
}
