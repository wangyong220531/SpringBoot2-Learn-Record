package com.boot;

import com.boot.bean.User;
import com.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        User user00 = run.getBean("Curry", User.class);
        User user01 = run.getBean("Curry", User.class);

        System.out.println(user00 == user01); // true

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        User user02 = bean.user00();
        User user03 = bean.user00();
        System.out.println(user02 == user03); // true

        User user = run.getBean("Curry")
    }
}
