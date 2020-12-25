package com.atguigu.spring5.aopAnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @Before(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void before(){
        System.out.println("PersonProxy里面的Before哦");
    }
}
