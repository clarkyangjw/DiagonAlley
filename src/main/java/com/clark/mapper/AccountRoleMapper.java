package com.clark.mapper;

import com.clark.pojo.AccountRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRoleMapper {

    List<AccountRole> getAccountRole();

    List<AccountRole> getAccountRoleByAccountId(int roleId);

    AccountRole getAccountRoleByAccountIdAndRoleId(int accountId, int roleId);

    int addAccountRole(AccountRole accountRole);

    int updateAccountRole(AccountRole accountRole);

    int deleteAccountRole(int accountId, int roleId);

}
