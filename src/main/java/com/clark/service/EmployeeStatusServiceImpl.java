package com.clark.service;

import com.clark.mapper.AdvertisingStatusMapper;
import com.clark.mapper.EmployeeStatusMapper;
import com.clark.pojo.AdvertisingStatus;
import com.clark.pojo.EmployeeStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeStatusServiceImpl implements EmployeeStatusService {

    @Autowired
    private EmployeeStatusMapper employeeStatusMapper;


    @Override
    public List<EmployeeStatus> getEmployeeStatus() {
        return employeeStatusMapper.getEmployeeStatus();
    }

    @Override
    public EmployeeStatus getEmployeeStatusById(int id) {
        return employeeStatusMapper.getEmployeeStatusById(id);
    }

    @Override
    public EmployeeStatus getEmployeeStatusByName(String name) {
        return employeeStatusMapper.getEmployeeStatusByName(name);
    }
}
