package com.zou.pojo;

public class User {
    private String name;

//    public User(){
//        System.out.printf("User的无参构造！");
//    }

    public User(String name){
        this.name=name;
        System.out.printf("有参构造创建对象！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name" + name);
    }
}
