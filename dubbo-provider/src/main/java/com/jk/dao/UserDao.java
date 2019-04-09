package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {
    @Select("SELECT t.id  userId,t.`name`  userName FROM  t_user_dubbo  t")
    List<User> selectUser();

    @Insert("INSERT INTO  t_user_dubbo (id,`name`) values(#{userId},#{userName})")
    void addUser(User user);

    @Delete("delete FROM  t_user_dubbo  where  id=#{value}")
    void deleteUser(Integer userId);

    @Select("SELECT t.id userId,t.`name`  userName FROM  t_user_dubbo  t   WHERE  t.id=#{value}")
    User queryUserById(Integer userId);

    @Update("update  t_user_dubbo t set   `name`=#{userName}  where id=#{userId}")
    void updateUserById(User user);
}
