package com.clark.service;

import com.clark.mapper.AdvertisingImageAdvertisingMapper;
import com.clark.mapper.UserAdvertisingMapper;
import com.clark.pojo.AdvertisingImageAdvertising;
import com.clark.pojo.UserAdvertising;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdvertisingImageAdvertisingServiceImpl implements AdvertisingImageAdvertisingService {

    @Autowired
    private AdvertisingImageAdvertisingMapper advertisingImageAdvertisingMapper;

    @Override
    public List<AdvertisingImageAdvertising> getAdvertisingImageAdvertisingByAdvertisingId(int AdvertisingId) {
        return advertisingImageAdvertisingMapper.getAdvertisingImageAdvertisingByAdvertisingId(AdvertisingId);
    }

    @Override
    public int addAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising) {
        return advertisingImageAdvertisingMapper.addAdvertisingImageAdvertising(advertisingImageAdvertising);
    }

    @Override
    public int updateAdvertisingImageAdvertising(AdvertisingImageAdvertising advertisingImageAdvertising) {
        return advertisingImageAdvertisingMapper.updateAdvertisingImageAdvertising(advertisingImageAdvertising);
    }

    @Override
    public int deleteAdvertisingImageAdvertising(int advertisingId) {
        return advertisingImageAdvertisingMapper.deleteAdvertisingImageAdvertising(advertisingId);
    }
}
