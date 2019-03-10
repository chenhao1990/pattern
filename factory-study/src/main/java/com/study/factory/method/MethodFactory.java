package com.study.factory.method;

import com.study.factory.simple.factory.pojo.Person;

/**
 * 工厂方法 ：将对象的创建和使用分开。工厂方法实现创建逻辑，用户不需要关心对象创建逻辑，只需要通过工厂创建后使用即可
 */
public interface MethodFactory {

    public Person getPerson();

}
