package com.chudichen.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * 数据分片规则:
 * 表按照数字顺序建立（xxx_0,xxx_1,xxx_2）路由规则按照自增id与表数量取模，
 * 如：id = 5，有3张表，则 5 % 3 = 2,选择xxx_2这张表
 *
 * @author chudichen
 * @since 2020-04-09 16:10
 */
public class PreciseShardingAlgorithmConfig implements PreciseShardingAlgorithm<Long> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        int size = collection.size();
        String suffix = String.valueOf(preciseShardingValue.getValue() % size);
        for (String table : collection) {
            if (StringUtils.endsWithIgnoreCase(table, suffix)) {
                return table;
            }
        }
        throw new UnsupportedOperationException("can not find target table with suffix : " + suffix);
    }
}
