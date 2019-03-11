package com.chen.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class Lawyer implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Object o = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return o;

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(target, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("收集证据，准备打官司!");
    }

    private void after() {
        System.out.println("哦豁，官司打输了，罪犯被判死刑，GAME OVER");
    }
}
