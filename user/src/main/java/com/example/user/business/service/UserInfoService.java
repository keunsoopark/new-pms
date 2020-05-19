package com.example.user.business.service;

import com.example.user.business.domain.UserInfo;
import com.example.user.data.repository.UserRepository;
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
        List<UserInfo> userInfos = new ArrayList<>();

        Iterable<UserInfo> results = this.userRepository.findByName(userName);
        results.forEach(userInfos::add);

        return userInfos;
    }

    public UserInfo getUserInfoByAccountId(String accountId) {
        return this.userRepository.findByAccountId(accountId);
    }


}
