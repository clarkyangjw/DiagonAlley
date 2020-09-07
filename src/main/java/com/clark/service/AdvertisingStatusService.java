package com.clark.service;

import com.clark.pojo.AdvertisingStatus;

import java.util.List;

public interface AdvertisingStatusService {

    List<AdvertisingStatus> getAdvertisingStatus();

    AdvertisingStatus getAdvertisingStatusById(int id);

    AdvertisingStatus getAdvertisingStatusByName(String name);


}
