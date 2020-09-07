package com.clark.service;

import com.clark.mapper.SysUserMapper;
import com.clark.mapper.UserMapper;
import com.clark.pojo.SysUser;
import com.clark.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

    @Override
    public int addUser(User User) {
        return userMapper.addUser(User);
    }

    @Override
    public int updateUser(User User) {
        return userMapper.updateUser(User);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
