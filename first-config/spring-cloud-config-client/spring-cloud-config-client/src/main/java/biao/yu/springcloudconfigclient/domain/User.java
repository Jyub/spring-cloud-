package biao.yu.springcloudconfigclient.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/8 14:24
 * @description: 用户类
 */
@ConfigurationProperties(prefix="yb.user")
public class User {
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
