package com.clark.service;

import com.clark.mapper.AdvertisingCategoryMapper;
import com.clark.mapper.AdvertisingStatusMapper;
import com.clark.pojo.AdvertisingCategory;
import com.clark.pojo.AdvertisingStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdvertisingStatusServiceImpl implements AdvertisingStatusService {

    @Autowired
    private AdvertisingStatusMapper advertisingStatusMapper;

    @Override
    public List<AdvertisingStatus> getAdvertisingStatus() {
        return advertisingStatusMapper.getAdvertisingStatus();
    }

    @Override
    public AdvertisingStatus getAdvertisingStatusById(int id) {
        return advertisingStatusMapper.getAdvertisingStatusById(id);
    }

    @Override
    public AdvertisingStatus getAdvertisingStatusByName(String name) {
        return advertisingStatusMapper.getAdvertisingStatusByName(name);
    }
}
