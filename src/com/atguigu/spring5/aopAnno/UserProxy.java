package com.atguigu.spring5.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void pointDemo(){

    }

    //前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before...");
    }

    @After(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    @AfterReturning(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void afterRuturning(){
        System.out.println("after returning....");
    }

    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("after Throwing....");
    }

    @Around(value = "execution(* com.atguigu.spring5.aopAnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around之前....");

        proceedingJoinPoint.proceed();

        System.out.println("around之后....");


    }

}
