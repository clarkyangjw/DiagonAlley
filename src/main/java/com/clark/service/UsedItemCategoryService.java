package com.clark.service;

import com.clark.pojo.AdvertisingCategory;
import com.clark.pojo.UsedItemCategory;

import java.util.List;

public interface UsedItemCategoryService {

    List<UsedItemCategory> getUsedItemCategory();

    UsedItemCategory getUsedItemCategoryById(int id);

    UsedItemCategory getUsedItemCategoryByName(String name);

    int addUsedItemCategory(UsedItemCategory usedItemCategory);

    int updateUsedItemCategory(UsedItemCategory usedItemCategory);

    int deleteUsedItemCategory(int id);

}
