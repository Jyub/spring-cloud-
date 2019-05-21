package biao.yu.spring.cloud.domain;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/20 16:00
 * @description: 用户
 */
public class User {
    /**
     * id
     */
    private Long id;
    /**
     * 名称
     */
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
