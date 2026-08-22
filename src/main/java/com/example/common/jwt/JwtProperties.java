package com.example.common.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * JWT 配置属性
 */
@Data
@Component
@ConfigurationProperties(prefix = "maoyan.jwt")
public class JwtProperties {

    /**
     * 签名密钥
     */
    private String secret = "maoyan-secret-key-2026";

    /**
     * 过期时间（小时）
     */
    private int expireHours = 2;
}
