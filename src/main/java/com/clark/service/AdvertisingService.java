package com.clark.service;

import com.clark.pojo.Advertising;

import java.util.List;

public interface AdvertisingService {

    List<Advertising> getAdvertising();

    List<Advertising> getAdvertisingByActiveAdvertising(int advertisingStatus);

    Advertising getAdvertisingById(int id);

    List<Advertising> getAdvertisingByName(String name);

    List<Advertising> getAdvertisingByAdvertisingCategoryId(int advertisingCategoryId);

    int addAdvertising(Advertising advertising);

    int updateAdvertising(Advertising advertising);

    int deleteAdvertising(int id);

}
