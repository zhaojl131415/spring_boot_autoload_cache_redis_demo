package com.cache.demo.web;

import com.cache.demo.entity.UserDO;
import com.cache.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/list")
    public List<UserDO> list() {
        return userService.listByCondition(new UserDO());
    }

    @GetMapping("/list_all")
    public List<UserDO> listAll() {
        return userService.list();
    }

    @GetMapping("/{id}")
    public UserDO detail(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/add")
    public UserDO add() {
        UserDO user = new UserDO();
        user.setName("name_" + System.currentTimeMillis());
        user.setPassword("11111");
        userService.register(user);
        return user;
    }

    @GetMapping("/update/{id}")
    public void update(@PathVariable Long id) {
        UserDO user = new UserDO();
        user.setId(id);
        user.setName("name:" + id);
        userService.updateUser(user);
    }

}
