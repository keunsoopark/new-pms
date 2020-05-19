package com.pms.common.user.web.service;

import com.pms.common.user.business.domain.UserInfo;
import com.pms.common.user.business.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(method=RequestMethod.GET, value="/user/{userName}")
    public List<UserInfo> getAllUserInfosByName(@PathVariable(value="userName") String userName) {
        return this.userInfoService.getUserInfosByName(userName);
    }

    @RequestMapping(method=RequestMethod.GET, value="/user/{userAccountId}")
    public UserInfo getUserInfoByAccountId(@PathVariable(value="userAccountId") String userAccountId) {
        return this.userInfoService.getUserInfoByAccountId(userAccountId);
    }

//    @RequestMapping(method=RequestMethod.POST, value="/user/")
//    public UserInfo postUserInfo() {
//        return this.userInfoService.save()
//    }
}
