package com.clark.service;

import com.clark.mapper.AdvertisingCategoryMapper;
import com.clark.mapper.ProfileMapper;
import com.clark.pojo.AdvertisingCategory;
import com.clark.pojo.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdvertisingCategoryServiceImpl implements AdvertisingCategoryService {

    @Autowired
    private AdvertisingCategoryMapper advertisingCategoryMapper;

    @Override
    public List<AdvertisingCategory> getAdvertisingCategory() {
        return advertisingCategoryMapper.getAdvertisingCategory();
    }

    @Override
    public AdvertisingCategory getAdvertisingCategoryById(int id) {
        return advertisingCategoryMapper.getAdvertisingCategoryById(id);
    }

    @Override
    public AdvertisingCategory getAdvertisingCategoryByName(String name) {
        return advertisingCategoryMapper.getAdvertisingCategoryByName(name);
    }

    @Override
    public int addAdvertisingCategory(AdvertisingCategory advertisingCategory) {
        return advertisingCategoryMapper.addAdvertisingCategory(advertisingCategory);
    }

    @Override
    public int updateAdvertisingCategory(AdvertisingCategory advertisingCategory) {
        return advertisingCategoryMapper.updateAdvertisingCategory(advertisingCategory);
    }

    @Override
    public int deleteAdvertisingCategory(int id) {
        return advertisingCategoryMapper.deleteAdvertisingCategory(id);
    }
}
