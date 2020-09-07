package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Integer id;
    private Integer profileId;
    private String email;
    private Date hired;
    private Date resignation;
    private String SIN;
    private Integer departmentId;
    private Integer positionId;
    private Integer employeeStatusId;

}
