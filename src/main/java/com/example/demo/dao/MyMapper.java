package com.example.demo.dao;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyMapper {

    @Select("select * from t_user")
    List<User> selectList();
}