package com.clark.service;

import com.clark.pojo.AdvertisingCategory;

import java.util.List;

public interface AdvertisingCategoryService {

    List<AdvertisingCategory> getAdvertisingCategory();

    AdvertisingCategory getAdvertisingCategoryById(int id);

    AdvertisingCategory getAdvertisingCategoryByName(String name);

    int addAdvertisingCategory(AdvertisingCategory advertisingCategory);

    int updateAdvertisingCategory(AdvertisingCategory advertisingCategory);

    int deleteAdvertisingCategory(int id);

}
