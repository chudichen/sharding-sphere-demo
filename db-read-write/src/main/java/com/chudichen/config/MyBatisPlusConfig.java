package com.chudichen.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chudichen
 * @since 2020-04-09 15:32
 */
@Configuration
@MapperScan(basePackages = "com.chudichen.mapper")
public class MyBatisPlusConfig {
}
