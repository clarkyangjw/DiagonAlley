package com.clark.service;

import com.clark.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee getEmployeeById(int id);

    List<Employee> getEmployeesExceptById(int id);

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployee(int id);

}
