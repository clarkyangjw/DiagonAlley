package com.clark.service;

import com.clark.pojo.Address;
import com.clark.pojo.Profile;

import java.util.List;

public interface ProfileService {

    List<Profile> getProfiles();

    Profile getProfileById(int id);

    Profile getProfileByLastName(String lastName);

    int addProfile(Profile profile);

    int updateProfile(Profile profile);

    int deleteProfile(int id);

}
