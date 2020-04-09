package com.chudichen.service;


import com.chudichen.entity.User;

import java.util.List;

/**
 * 用户Service
 *
 * @author chudichen
 * @since 2020-04-09 15:02
 */
public interface UserService {

    /**
     * 获取所有用户
     *
     * @return 用户列表
     */
    List<User> list();

    /**
     * 保存User
     *
     * @param user 用户
     * @return 保存结果
     */
    String saveOne(User user);
}
