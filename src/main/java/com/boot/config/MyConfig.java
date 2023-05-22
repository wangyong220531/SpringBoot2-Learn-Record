package com.boot.config;

import com.boot.bean.Pet;
import com.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class MyConfig {

    @Bean("Curry")
    public User user00() {
        User caixvteng = new User("蔡徐腾", 22);
        caixvteng.setPet(tomPet());
        return caixvteng;
    }

    @Bean("Tom")
    public Pet tomPet() {
        return new Pet("Jack");
    }
}
