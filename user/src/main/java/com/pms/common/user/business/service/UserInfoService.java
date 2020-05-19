package com.pms.common.user.business.service;

import com.pms.common.user.business.domain.UserInfo;
import com.pms.common.user.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserInfoService {
    private final UserRepository userRepository;

    @Autowired
    public UserInfoService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserInfo> getUserInfosByName(String userName) {
        return this.userRepository.findByName(userName);
    }

    public UserInfo getUserInfoByAccountId(String accountId) {
        return this.userRepository.findByAccountId(accountId);
    }


}
