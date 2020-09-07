package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    private Integer id;
    private String firstName;
    private String lastName;
    private String genderId;
    private Date birth;
    private String phone;
    private Integer addressId;
    private Integer isDel;

}
