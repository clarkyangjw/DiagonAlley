package com.clark.service;

import com.clark.mapper.ProfileMapper;
import com.clark.pojo.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public List<Profile> getProfiles() {
        return profileMapper.getProfiles();
    }

    @Override
    public Profile getProfileById(int id) {
        return profileMapper.getProfileById(id);
    }

    @Override
    public Profile getProfileByLastName(String lastName) {
        return profileMapper.getProfileByLastName(lastName);
    }

    @Override
    public int addProfile(Profile profile) {
        return profileMapper.addProfile(profile);
    }

    @Override
    public int updateProfile(Profile profile) {
        return profileMapper.updateProfile(profile);
    }

    @Override
    public int deleteProfile(int id) {
        return profileMapper.deleteProfile(id);
    }
}
