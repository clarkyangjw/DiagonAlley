package com.clark.mapper;

import com.clark.pojo.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysUserMapper {

    List<SysUser> getSysUsers();

    SysUser getSysUserById(int id);

    SysUser getSysUserByUsername(String username);

    int addSysUser(SysUser sysUser);

    int updateSysUser(SysUser sysUser);

    int deleteSysUser(int id);

}
