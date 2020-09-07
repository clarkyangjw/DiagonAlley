package com.clark.service;

import com.clark.mapper.AdvertisingCategoryMapper;
import com.clark.mapper.UsedItemCategoryMapper;
import com.clark.pojo.AdvertisingCategory;
import com.clark.pojo.UsedItemCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsedItemCategoryServiceImpl implements UsedItemCategoryService {

    @Autowired
    private UsedItemCategoryMapper usedItemCategoryMapper;

    @Override
    public List<UsedItemCategory> getUsedItemCategory() {
        return usedItemCategoryMapper.getUsedItemCategory();
    }

    @Override
    public UsedItemCategory getUsedItemCategoryById(int id) {
        return usedItemCategoryMapper.getUsedItemCategoryById(id);
    }

    @Override
    public UsedItemCategory getUsedItemCategoryByName(String name) {
        return usedItemCategoryMapper.getUsedItemCategoryByName(name);
    }

    @Override
    public int addUsedItemCategory(UsedItemCategory usedItemCategory) {
        return usedItemCategoryMapper.addUsedItemCategory(usedItemCategory);
    }

    @Override
    public int updateUsedItemCategory(UsedItemCategory usedItemCategory) {
        return usedItemCategoryMapper.updateUsedItemCategory(usedItemCategory);
    }

    @Override
    public int deleteUsedItemCategory(int id) {
        return usedItemCategoryMapper.deleteUsedItemCategory(id);
    }
}
