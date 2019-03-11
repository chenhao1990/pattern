package com.chen.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    public Object getInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();

       // Object result = method.invoke(target, objects);
        Object result=  methodProxy.invokeSuper(o,objects);
        if (result instanceof String) {
            String s = ((String) result).toUpperCase();
            after();
            return s;
        }

        return null;
    }

    private void before() {
        System.out.println("开始查询");
    }

    private void after() {
        System.out.println("返回结果");
    }
}
