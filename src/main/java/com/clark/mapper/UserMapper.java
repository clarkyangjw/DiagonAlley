package com.clark.mapper;

import com.clark.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getUsers();

    User getUserById(int id);

    User getUserByUsername(String username);

    int addUser(User User);

    int updateUser(User User);

    int deleteUser(int id);

}
