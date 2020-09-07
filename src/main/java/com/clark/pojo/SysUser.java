package com.clark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {

    private Integer id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private String profileId;
    private Date registerDate;
    private Date lastLogin;
    private Integer accountStatus;
    private Integer accountNonLocked;
    private Integer usernameNonExpired;
    private Integer passwordNonExpired;
    private String nickName;
    private Integer employeeId;

}
