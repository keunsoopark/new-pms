package com.pms.common.user.data.repository;

import com.pms.common.user.business.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, UUID> {
    List<UserInfo> findByName(String name);
    UserInfo findByAccountId(String accountId);
}
