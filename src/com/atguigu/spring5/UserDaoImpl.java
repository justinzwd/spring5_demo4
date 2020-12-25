package com.atguigu.spring5;

public class UserDaoImpl implements UserDao {

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了");
        return a + b;
    }

    @Override
    public String update(String str) {
        System.out.println("update方法执行了");
        return str;
    }
}
