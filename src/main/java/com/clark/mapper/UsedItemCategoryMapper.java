package com.clark.mapper;

import com.clark.pojo.UsedItemCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsedItemCategoryMapper {

    List<UsedItemCategory> getUsedItemCategory();

    UsedItemCategory getUsedItemCategoryById(int id);

    UsedItemCategory getUsedItemCategoryByName(String name);

    int addUsedItemCategory(UsedItemCategory usedItemCategory);

    int updateUsedItemCategory(UsedItemCategory usedItemCategory);

    int deleteUsedItemCategory(int id);

}
