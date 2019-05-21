package biao.yu.spring.cloud.controller;

import biao.yu.spring.cloud.api.UserService;
import biao.yu.spring.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/21 16:52
 * @description: 用户controller
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/save")
    public boolean save(@RequestBody User user){
        return userService.save(user);
    }
}
