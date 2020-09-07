package com.clark.service;

import com.clark.pojo.AdvertisingImageAdvertising;

import java.util.List;

public interface AdvertisingImageAdvertisingService {

    //List<AdvertisingImageAdvertising> getAdvertisingImageAdvertising();

    List<AdvertisingImageAdvertising> getAdvertisingImageAdvertisingByAdvertisingId(int AdvertisingId);

    //AdvertisingImageAdvertising getAdvertisingImageAdvertisingByAdvertisingImageIdAndAdvertisingId(int AdvertisingImageId, int advertisingId);

    int addAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising);

    int updateAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising);

    int deleteAdvertisingImageAdvertising(int advertisingId);

}
