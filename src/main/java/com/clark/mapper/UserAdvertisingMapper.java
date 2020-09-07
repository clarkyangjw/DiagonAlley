package com.clark.mapper;

import com.clark.pojo.Profile;
import com.clark.pojo.UserAdvertising;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserAdvertisingMapper {

    List<UserAdvertising> getUserAdvertising();

    List<UserAdvertising> getUserAdvertisingByUserId(int userId);

    UserAdvertising getUserAdvertisingByUserIdAndAdvertisingId(int userId, int advertisingId);

    int addUserAdvertising(UserAdvertising userAdvertising);

    int updateUserAdvertising(UserAdvertising userAdvertising);

    int deleteUserAdvertising(int userId, int advertisingId);

}
