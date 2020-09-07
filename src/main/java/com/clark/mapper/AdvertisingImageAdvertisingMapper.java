package com.clark.mapper;

import com.clark.pojo.AdvertisingImageAdvertising;
import com.clark.pojo.UserAdvertising;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisingImageAdvertisingMapper {

    //List<AdvertisingImageAdvertising> getAdvertisingImageAdvertising();

    List<AdvertisingImageAdvertising> getAdvertisingImageAdvertisingByAdvertisingId(int AdvertisingId);

    //AdvertisingImageAdvertising getAdvertisingImageAdvertisingByAdvertisingImageIdAndAdvertisingId(int AdvertisingImageId, int advertisingId);

    int addAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising);

    int updateAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising);

    int deleteAdvertisingImageAdvertising(int advertisingId);

}
