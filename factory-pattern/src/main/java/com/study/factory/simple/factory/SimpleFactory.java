package com.study.factory.simple.factory;

import com.study.factory.simple.factory.pojo.Person;
import com.study.factory.simple.factory.pojo.Student;
import com.study.factory.simple.factory.pojo.Worker;

/**
 * 简单工厂设计模式 简单工厂又叫静态工厂设计模式，
 * 根据传入的参数决定创建那种产品
 */
public class SimpleFactory {
    /**
     * 利用简单工厂创建类的实例；
     *
     * @param className 类名
     * @return
     */
    public Object createObject(String className) {
        try {
            Object instance = Class.forName(className).newInstance();
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Person selectPerson(String type) {

        if ("student".equalsIgnoreCase(type)) {

            return new Student();
        } else if ("worker".equalsIgnoreCase(type)) {

            return new Worker();
        } else {
            return null;
        }
    }
}
