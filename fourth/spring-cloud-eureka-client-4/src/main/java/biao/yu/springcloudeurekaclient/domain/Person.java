package biao.yu.springcloudeurekaclient.domain;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/16 17:53
 * @description: pojo
 */
public class Person {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
