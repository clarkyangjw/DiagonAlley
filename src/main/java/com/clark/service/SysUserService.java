package com.clark.service;

import com.clark.pojo.SysUser;

import java.util.List;

public interface SysUserService {

    List<SysUser> getSysUsers();

    SysUser getSysUserById(int id);

    SysUser getSysUserByUsername(String username);

    int addSysUser(SysUser sysUser);

    int updateSysUser(SysUser sysUser);

    int deleteSysUser(int id);

}
