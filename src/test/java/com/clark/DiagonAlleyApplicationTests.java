package com.clark;

import com.clark.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiagonAlleyApplicationTests {

    @Autowired
    AccountRoleMapper accountRoleMapper;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AdvertisingCategoryMapper advertisingCategoryMapper;

    @Autowired
    AdvertisingImageAdvertisingMapper advertisingImageAdvertisingMapper;

    @Autowired
    AdvertisingMapper advertisingMapper;

    @Autowired
    AdvertisingStatusMapper advertisingStatusMapper;

    @Autowired
    AuthorityMapper authorityMapper;

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeStatusMapper employeeStatusMapper;

    @Autowired
    GenderMapper genderMapper;

    @Autowired
    PositionMapper positionMapper;

    @Autowired
    ProfileMapper profileMapper;

    @Autowired
    RoleAuthorityMapper roleAuthorityMapper;

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    UsedBookMapper usedBookMapper;

    @Autowired
    UsedItemCategoryMapper usedItemCategoryMapper;

    @Autowired
    UserAdvertisingMapper userAdvertisingMapper;

    @Autowired
    UserMapper userMapper;


    @Test
    void contextLoads() {
    }

    @Test
    public void databaseTest() {
        System.out.println(accountRoleMapper.getAccountRole());
        System.out.println(addressMapper.getAddressById(1));
        System.out.println(advertisingCategoryMapper.getAdvertisingCategory());
        System.out.println(advertisingImageAdvertisingMapper.getAdvertisingImageAdvertisingByAdvertisingId(1));
        System.out.println(advertisingMapper.getAdvertising());
        System.out.println(advertisingStatusMapper.getAdvertisingStatus());
        System.out.println(authorityMapper.getAuthorities());
        System.out.println(departmentMapper.getDepartments());
        System.out.println(employeeMapper.getEmployees());
        System.out.println(employeeStatusMapper.getEmployeeStatus());
        System.out.println(genderMapper.getGenders());
        System.out.println(positionMapper.getPositions());
        System.out.println(profileMapper.getProfiles());
        System.out.println(roleAuthorityMapper.getRoleAuthorities());
        System.out.println(roleMapper.getRoles());
        System.out.println(sysUserMapper.getSysUsers());
        System.out.println(usedBookMapper.getUsedBook());
        System.out.println(usedItemCategoryMapper.getUsedItemCategory());
        System.out.println(userAdvertisingMapper.getUserAdvertising());
        System.out.println(userMapper.getUsers());

    }

}
