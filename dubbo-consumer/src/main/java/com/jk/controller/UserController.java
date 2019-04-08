package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ResponseBody+Controller注解的结合
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("/saveUser/{userName}/{age}")  // result风格（指定请求方式）
    public User saveUser(@PathVariable String userName, @PathVariable Integer age){
        System.out.println("------------------------"+age+"--------------------");
        User user = new User();
        user.setUserName(userName);
        user = userService.saveUser(user);
        return user;
    }

}
