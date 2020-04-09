package com.chudichen.entity;

import com.chudichen.enums.Status;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户表
 *
 * @author chudichen
 * @since 2020-04-09 14:56
 */
@Data
public class User {

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除 1未删除 0删除
     * {@link Status}
     */
    private Integer status;

    public User(Long id, String name, String sex, Integer age) {
        this.id = id;
        setDefaultValue(name, sex, age);
    }

    public User(String name, String sex, Integer age) {
        setDefaultValue(name, sex, age);
    }

    private void setDefaultValue(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;

        Date date = new Date();
        this.createTime = date;
        this.updateTime = date;
        this.status = Status.ON.ordinal();
    }

    public User() {}
}
