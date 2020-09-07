package com.clark.mapper;

import com.clark.pojo.AdvertisingCategory;
import com.clark.pojo.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisingCategoryMapper {

    List<AdvertisingCategory> getAdvertisingCategory();

    AdvertisingCategory getAdvertisingCategoryById(int id);

    AdvertisingCategory getAdvertisingCategoryByName(String name);

    int addAdvertisingCategory(AdvertisingCategory advertisingCategory);

    int updateAdvertisingCategory(AdvertisingCategory advertisingCategory);

    int deleteAdvertisingCategory(int id);

}
