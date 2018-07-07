package com.cache.demo.service;

import com.cache.demo.entity.UserDO;

import java.util.List;

public interface UserService {

    UserDO getUserById(Long userId);

    // @Cache(expire = 600, key = "'userid-list-' + @@hash(#args[0])")
    List<UserDO> listByCondition(UserDO condition);

    List<UserDO> list();

    // @CacheDeleteTransactional
    Long register(UserDO user);

    UserDO doLogin(String name, String password);

    void updateUser(UserDO user);

    void deleteUserById(Long userId);
}
