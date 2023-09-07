package com.lm.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 实现Nacos统一配置的pattern属性管理
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern") //前缀拼接上变量名 和配置文件中一致则会取值
public class PatternProperties {
    private String dateformat;
    private String envShareValue;
}
