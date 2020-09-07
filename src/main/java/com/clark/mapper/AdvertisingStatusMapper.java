package com.clark.mapper;

import com.clark.pojo.AdvertisingStatus;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AdvertisingStatusMapper {

    List<AdvertisingStatus> getAdvertisingStatus();

    AdvertisingStatus getAdvertisingStatusById(int id);

    AdvertisingStatus getAdvertisingStatusByName(String name);

}
