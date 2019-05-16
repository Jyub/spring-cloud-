package biao.yu.springcloudconsulclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/16 15:28
 * @description: consul 健康检查
 */
@RestController
public class CheckController {

    @GetMapping("/check")
    public String check(){
        return "OK";
    }
}
