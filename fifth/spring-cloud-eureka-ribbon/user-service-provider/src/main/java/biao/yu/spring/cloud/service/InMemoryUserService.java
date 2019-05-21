package biao.yu.spring.cloud.service;

import biao.yu.spring.cloud.api.UserService;
import biao.yu.spring.cloud.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 内存实现{@link UserService}
 * @version v1.0
 * @author: yubiao
 * @date: 2019/5/21 15:48
 * @description: 用户服务实现
 */
@Service
public class InMemoryUserService  implements UserService{

    private Map<Long,User> repository =new ConcurrentHashMap<>();

    @Override
    public boolean save(User user) {
        return repository.put(user.getId(),user) == null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(repository.values());
    }
}
