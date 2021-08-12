package com.zou.config;

import com.zou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这个也会Spring容器托管，注册到容器中，因为他本来就是一个@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml一样的

@Configuration
public class ZouConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
