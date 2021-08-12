package com.zou.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于 <bean id="user" class="com.zou.pojo.User"/>
//@Component 中文：组件
@Component
@Scope("prototype")
public class User {
    //等价于<property name="name" value="邹"/>
    @Value("邹")
    public String name;

    //等价于<property name="name" value="邹"/>
    @Value("邹旭")
    public void setName(String name) {
        this.name = name;
    }
}
