package com.study.factory.abs;

import com.study.factory.abs.bean.Food;
import com.study.factory.abs.bean.Milk;

public class MilKFactory implements AbsFactory {
    @Override
    public Food producFood() {
        return new Milk();
    }

    @Override
    public void wrapp() {
        System.out.println("牛奶用瓶装或者盒装");
    }
}
