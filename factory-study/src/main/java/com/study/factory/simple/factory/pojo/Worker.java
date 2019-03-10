package com.study.factory.simple.factory.pojo;

public class Worker extends Person {
    @Override
    public void behavior() {
        System.out.println("工人的行为是工作");
    }
}
