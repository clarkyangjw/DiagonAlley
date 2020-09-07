package com.clark.mapper;

import com.clark.pojo.EmployeeStatus;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeStatusMapper {

    List<EmployeeStatus> getEmployeeStatus();

    EmployeeStatus getEmployeeStatusById(int id);

    EmployeeStatus getEmployeeStatusByName(String name);

}
