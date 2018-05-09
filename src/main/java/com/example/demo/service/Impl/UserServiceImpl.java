package com.example.demo.service.Impl;

import com.example.demo.bean.User;
import com.example.demo.dao.MyMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> selectList() {
        return myMapper.selectList();
    }

    @Autowired
    private MyMapper myMapper;
}
