package com.atguigu.spring5.aopAnno;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("add...");
    }
}
