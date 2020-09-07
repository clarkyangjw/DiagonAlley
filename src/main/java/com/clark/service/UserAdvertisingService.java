package com.clark.service;

import com.clark.pojo.UserAdvertising;

import java.util.List;

public interface UserAdvertisingService {

    List<UserAdvertising> getUserAdvertising();

    List<UserAdvertising> getUserAdvertisingByUserId(int userId);

    UserAdvertising getUserAdvertisingByUserIdAndAdvertisingId(int userId, int advertisingId);

    int addUserAdvertising(UserAdvertising userAdvertising);

    int updateUserAdvertising(UserAdvertising userAdvertising);

    int deleteUserAdvertising(int userId, int advertisingId);

}
