package com.zou.config;

import com.zou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZouConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
