package com.chudichen.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chudichen
 * @since 2020-04-09 15:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
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
}
