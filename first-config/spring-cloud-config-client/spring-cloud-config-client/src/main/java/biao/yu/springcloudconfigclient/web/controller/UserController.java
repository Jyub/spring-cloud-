package biao.yu.springcloudconfigclient.web.controller;

import biao.yu.springcloudconfigclient.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/8 14:30
 * @description:用户controller
 */
@RestController
@EnableConfigurationProperties(User.class)
public class UserController {
    private final User user;

    @Autowired
    public UserController(User user) {
        this.user = user;
    }

    @GetMapping("user")
    public User getUser(){
        return user;
    }
}
