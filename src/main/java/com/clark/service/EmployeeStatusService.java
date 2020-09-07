package com.clark.service;

import com.clark.pojo.EmployeeStatus;

import java.util.List;

public interface EmployeeStatusService {

    List<EmployeeStatus> getEmployeeStatus();

    EmployeeStatus getEmployeeStatusById(int id);

    EmployeeStatus getEmployeeStatusByName(String name);


}
