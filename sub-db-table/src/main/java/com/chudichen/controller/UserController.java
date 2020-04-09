package com.chudichen.controller;


import com.chudichen.entity.User;
import com.chudichen.service.UserService;
import com.chudichen.vo.UserVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author chudichen
 * @since 2020-04-09 15:17
 */
@RestController
@RequestMapping("/api/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 保存用户
     *
     * @return
     */
    @PostMapping("user")
    public Object saveUser(@RequestBody UserVO userVO) {
        return userService.saveOne(new User(userVO.getName(), userVO.getSex(), userVO.getAge()));
    }


    @GetMapping("user-list")
    public Object listUser() {
        return userService.list();
    }
}
