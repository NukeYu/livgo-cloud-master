package com.livgo.cloud.config.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Description:Redis config
 * Author:     gaocl
 * Date:       2017/12/1
 * Version:    V1.0.0
 * Update:     更新说明
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@RefreshScope
@ConfigurationProperties(prefix = "redis")
public class RedisConfig implements Serializable{

    private final static long serialVersionUID = 1L;

    private String key;

}
