package com.chudichen.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chudichen.enums.Status;
import lombok.Data;

import java.util.Date;

/**
 * 用户表
 *
 * @author chudichen
 * @since 2020-04-09 14:56
 */
@Data
@TableName("tab_user")
public class User {

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
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
     * {@link com.chudichen.enums.Status}
     */
    private Integer status;

    public User(String name, String sex, Integer age) {
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
