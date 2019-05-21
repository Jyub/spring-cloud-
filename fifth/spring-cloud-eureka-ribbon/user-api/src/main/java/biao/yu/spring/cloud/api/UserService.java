package biao.yu.spring.cloud.api;

import biao.yu.spring.cloud.domain.User;

import java.util.List;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/21 15:47
 * @description: 用户服务接口
 */
public interface UserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * 查询所有用户列表
     * @return
     */
    List<User> findAll();
}
