package com.chudichen.controller;

import com.chudichen.BaseTest;
import com.chudichen.vo.UserVO;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


/**
 * @author chudichen
 * @since 2020-04-09 15:24
 */
public class UserControllerTest extends BaseTest {

    @Test
    public void saveUser() throws Exception {
        String json = JSON.toJSONString(new UserVO("Tom", "男", 18));
        mvc.perform(MockMvcRequestBuilders.post("/api/user")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(json)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void listUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/user-list")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
