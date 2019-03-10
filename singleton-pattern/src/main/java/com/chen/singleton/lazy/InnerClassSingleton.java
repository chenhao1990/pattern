package com.chen.singleton.lazy;

/**
 * @author ：chenhao
 * @Date : 2019/3/10
 * @description : 静态内部类单例
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    public static final InnerClassSingleton getInstance() {

        return InnerClass.INSTANCE;
    }

    private static class InnerClass {

        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
