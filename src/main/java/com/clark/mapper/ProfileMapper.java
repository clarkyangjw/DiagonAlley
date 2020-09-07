package com.clark.mapper;

import com.clark.pojo.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileMapper {

    List<Profile> getProfiles();

    Profile getProfileById(int id);

    Profile getProfileByLastName(String lastName);

    int addProfile(Profile profile);

    int updateProfile(Profile profile);

    int deleteProfile(int id);

}
