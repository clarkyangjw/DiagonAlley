package com.clark.mapper;

import com.clark.pojo.Gender;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenderMapper {

    List<Gender> getGenders();

    Gender getGenderById(int id);

    Gender getGenderByName(String name);

}
