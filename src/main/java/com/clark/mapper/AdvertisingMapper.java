package com.clark.mapper;

import com.clark.pojo.Advertising;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisingMapper {

    List<Advertising> getAdvertising();

    List<Advertising> getAdvertisingByActiveAdvertising(int advertisingStatus);

    Advertising getAdvertisingById(int id);

    List<Advertising> getAdvertisingByName(String name);

    List<Advertising> getAdvertisingByAdvertisingCategoryId(int advertisingCategoryId);

    int addAdvertising(Advertising advertising);

    int updateAdvertising(Advertising advertising);

    int deleteAdvertising(int id);

}
