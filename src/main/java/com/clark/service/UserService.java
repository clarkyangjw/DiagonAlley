package com.clark.service;

import com.clark.pojo.SysUser;
import com.clark.pojo.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    int addUser(User User);

    int updateUser(User User);

    int deleteUser(int id);

}
