package com.clark.mapper;

import com.clark.pojo.RoleAuthority;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleAuthorityMapper {

    List<RoleAuthority> getRoleAuthorities();

    List<RoleAuthority> getRoleAuthorityByRoleId(int roleId);

    RoleAuthority getRoleAuthorityByRoleIdAndAuthorityId(int roleId, int authorityId);

    int addRoleAuthority(RoleAuthority roleAuthority);

    int updateRoleAuthority(RoleAuthority roleAuthority);

    int deleteRoleAuthority(int roleId, int authorityId);

}
