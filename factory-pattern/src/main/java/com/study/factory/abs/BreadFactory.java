package com.study.factory.abs;

import com.study.factory.abs.bean.Bread;
import com.study.factory.abs.bean.Food;

public class BreadFactory implements AbsFactory {
    @Override
    public Food producFood() {
        return new Bread();
    }

    @Override
    public void wrapp() {
        System.out.println("面包用袋装");
    }
}
