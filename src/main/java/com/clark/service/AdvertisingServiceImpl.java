package com.clark.service;

import com.clark.mapper.AdvertisingMapper;
import com.clark.mapper.UserMapper;
import com.clark.pojo.Advertising;
import com.clark.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdvertisingServiceImpl implements AdvertisingService {

    @Autowired
    private AdvertisingMapper advertisingMapper;

    @Override
    public List<Advertising> getAdvertising() {
        return advertisingMapper.getAdvertising();
    }

    @Override
    public List<Advertising> getAdvertisingByActiveAdvertising(int advertisingStatus) {
        return advertisingMapper.getAdvertisingByActiveAdvertising(advertisingStatus);
    }

    @Override
    public Advertising getAdvertisingById(int id) {
        return advertisingMapper.getAdvertisingById(id);
    }

    @Override
    public List<Advertising> getAdvertisingByName(String name) {
        return advertisingMapper.getAdvertisingByName(name);
    }

    @Override
    public List<Advertising> getAdvertisingByAdvertisingCategoryId(int advertisingCategoryId) {
        return advertisingMapper.getAdvertisingByAdvertisingCategoryId(advertisingCategoryId);
    }

    @Override
    public int addAdvertising(Advertising advertising) {
        return advertisingMapper.addAdvertising(advertising);
    }

    @Override
    public int updateAdvertising(Advertising advertising) {
        return advertisingMapper.updateAdvertising(advertising);
    }

    @Override
    public int deleteAdvertising(int id) {
        return advertisingMapper.deleteAdvertising(id);
    }
}
