package com.clark.service;

import com.clark.mapper.UserAdvertisingMapper;
import com.clark.pojo.UserAdvertising;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserAdvertisingServiceImpl implements UserAdvertisingService {

    @Autowired
    private UserAdvertisingMapper userAdvertisingMapper;

    @Override
    public List<UserAdvertising> getUserAdvertising() {
        return userAdvertisingMapper.getUserAdvertising();
    }

    @Override
    public List<UserAdvertising> getUserAdvertisingByUserId(int userId) {
        return userAdvertisingMapper.getUserAdvertisingByUserId(userId);
    }

    @Override
    public UserAdvertising getUserAdvertisingByUserIdAndAdvertisingId(int userId, int advertisingId) {
        return userAdvertisingMapper.getUserAdvertisingByUserIdAndAdvertisingId(userId, advertisingId);
    }

    @Override
    public int addUserAdvertising(UserAdvertising userAdvertising) {
        return userAdvertisingMapper.addUserAdvertising(userAdvertising);
    }

    @Override
    public int updateUserAdvertising(UserAdvertising userAdvertising) {
        return userAdvertisingMapper.updateUserAdvertising(userAdvertising);
    }

    @Override
    public int deleteUserAdvertising(int userId, int advertisingId) {
        return userAdvertisingMapper.deleteUserAdvertising(userId, advertisingId);
    }
}
