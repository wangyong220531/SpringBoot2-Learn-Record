package com.boot;

import ch.qos.logback.core.db.DBHelper;
import com.boot.bean.Pet;
import com.boot.bean.User;
import com.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.interceptor.CacheAspectSupport;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        String[] names = run.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }

        int beanTotal = run.getBeanDefinitionCount();
        System.out.println(beanTotal);

        String[] beanNameForType = run.getBeanNamesForType(CacheAspectSupport.class);
        System.out.println(beanNameForType.length);
    }
}
