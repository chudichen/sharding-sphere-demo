package com.chudichen.mapper;

import com.chudichen.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chudichen
 * @since 2020-04-09 15:07
 */
@Repository
public interface UserMapper {

    @Select("select * from tab_user")
    List<User> selectAll();

    @Insert("insert into tab_user (" +
            "id, name, sex, " +
            "age, create_time, update_time, status) " +
            "values (#{id}, #{name}, #{sex}," +
            "#{age}, #{createTime}, #{updateTime}, #{status})")
    void insert(User user);
}
