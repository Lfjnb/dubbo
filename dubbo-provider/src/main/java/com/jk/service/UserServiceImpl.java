package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.model.User;
import org.springframework.stereotype.Component;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setUserId(1001);
        return user;
    }

}
