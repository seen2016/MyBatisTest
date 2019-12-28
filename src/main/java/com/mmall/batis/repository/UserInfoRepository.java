package com.mmall.batis.repository;

import com.mmall.batis.pojo.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2019/12/27.
 */
public interface UserInfoRepository {

    public int add(UserInfo user);


    public int deleteById(String id);


    public int update(UserInfo user);


    public UserInfo findById(int id);


    public List<UserInfo> findAll();
}
