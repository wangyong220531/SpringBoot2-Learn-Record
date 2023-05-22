package com.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.boot.bean.Car;
import com.boot.bean.Pet;
import com.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({DBHelper.class})
@Configuration(proxyBeanMethods = true)
@EnableConfigurationProperties(Car.class)
public class MyConfig {


}
