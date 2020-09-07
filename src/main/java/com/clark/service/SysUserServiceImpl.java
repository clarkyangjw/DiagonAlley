package com.clark.service;

import com.clark.mapper.ProfileMapper;
import com.clark.mapper.SysUserMapper;
import com.clark.pojo.Profile;
import com.clark.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getSysUsers() {
        return sysUserMapper.getSysUsers();
    }

    @Override
    public SysUser getSysUserById(int id) {
        return sysUserMapper.getSysUserById(id);
    }

    @Override
    public SysUser getSysUserByUsername(String username) {
        return sysUserMapper.getSysUserByUsername(username);
    }

    @Override
    public int addSysUser(SysUser sysUser) {
        return sysUserMapper.addSysUser(sysUser);
    }

    @Override
    public int updateSysUser(SysUser sysUser) {
        return sysUserMapper.updateSysUser(sysUser);
    }

    @Override
    public int deleteSysUser(int id) {
        return sysUserMapper.deleteSysUser(id);
    }
}
