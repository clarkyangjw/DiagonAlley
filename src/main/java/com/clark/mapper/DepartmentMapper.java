package com.clark.mapper;

import com.clark.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentMapper {

    List<Department> getDepartments();

    Department getDepartmentById(int id);

    Department getDepartmentByName(String name);

    int addDepartment(Department department);

    int updateDepartment(Department department);

    int deleteDepartment(int id);

}
