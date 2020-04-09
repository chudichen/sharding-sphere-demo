package com.chudichen.service.impl;

import com.chudichen.BaseTest;
import com.chudichen.entity.User;
import com.chudichen.service.UserService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author chudichen
 * @since 2020-04-09 16:57
 */
public class UserServiceImplTest extends BaseTest {

    @Autowired
    private UserService userService;

    @Test
    public void saveOne() {
        List<User> userList = Lists.newArrayList();
        userList.add(new User(1L,"Alice", "女", 3));
        userList.add(new User(2L,"Scott", "男", 30));
        userList.add(new User(3L,"Susan", "女", 28));
        userList.add(new User(4L,"Carter", "男", 64));
        userList.add(new User(5L,"Eve", "女", 62));
        userList.parallelStream().forEach(userService::saveOne);
    }
}
