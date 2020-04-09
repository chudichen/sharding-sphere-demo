package com.chudichen.service.impl;


import com.chudichen.entity.User;
import com.chudichen.mapper.UserMapper;
import com.chudichen.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户接口实现
 *
 * @author chudichen
 * @since 2020-04-09 15:05
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }

    @Override
    public String saveOne(User user) {
        userMapper.insert(user);
        return "保存成功";
    }
}
