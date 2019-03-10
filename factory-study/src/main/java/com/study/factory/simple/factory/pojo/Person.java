package com.study.factory.simple.factory.pojo;

import java.util.Date;
//person
public abstract class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //生日
    private Date birthDay;

    public abstract void behavior();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
