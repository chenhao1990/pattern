package com.study.factory.abs;

import com.study.factory.abs.bean.Food;

/**
 * 抽象工厂提供一个接口 创建不同的产品之外还可以赋予不同的属性及行为等，而不需要指定具体的类
 */
public interface AbsFactory {

    public Food producFood();

    public void wrapp();
}
