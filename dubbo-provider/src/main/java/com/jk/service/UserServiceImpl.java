package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.UserDao;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User saveUser(User user) {
        user.setUserId(1001);
        return user;
    }

    @Override
    public List<User> selectUser() {
        List<User> list=userDao.selectUser();
        return list;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    @Override
    public User queryUserById(Integer userId) {
        User user=userDao.queryUserById(userId);
        return  user;
    }

    @Override
    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }

}
