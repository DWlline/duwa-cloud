package com.dwline.duwa.cloud.provider.service.impl;

import com.dwline.duwa.cloud.provider.entity.User;
import com.dwline.duwa.cloud.provider.mapper.UserMapper;
import com.dwline.duwa.cloud.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}
