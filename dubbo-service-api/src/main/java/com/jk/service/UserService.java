package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> selectUser();

    void addUser(User user);

    void deleteUser(Integer userId);

    User queryUserById(Integer userId);

    void updateUserById(User user);
}
