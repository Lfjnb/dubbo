package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping("selectUser")
    public List<User>  selectUser(){
        List<User> list=userService.selectUser();
        return list;
    }

    @RequestMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "1";
    }

    //    void deleteUser(Integer userId);
    @RequestMapping("deleteUser")
    public String deleteUser(Integer userId){
        userService.deleteUser(userId);
        return "1";
    }

    @RequestMapping("queryUserById")
    public User queryUserById(Integer   userId){
        User user=userService.queryUserById(userId);
        return user;
    }

    @RequestMapping("updateUserById")
    public String updateUserById(User user){
        userService.updateUserById(user);
        return "1";
    }
}
