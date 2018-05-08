package com.example.demo.service;

import com.example.demo.bean.UserInfo;

public interface UserInfoService {

    public UserInfo findByUsername(String userName);
}
