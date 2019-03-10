package com.chen.singleton.hunger;

/**
 * @author ：chenhao
 * @Date : 2019/3/10
 * @description : 单例模式的基本原则，构造方法私有化，提供和对外获取对象的方法
 * 饿汉式单例设计模式
 * 饿汉式设计天生线程安全，随着类加载就创建对象。
 * 所以第一次访问的时候效率高，但是如果这个单例对象不需要使用也会创建，占用内存
 */
public class HungerSingleton {

    private HungerSingleton() {
        //防止反射破坏单例
        if (INSTANCE != null) {
            throw new RuntimeException("对象会已存在");
        }
    }

    //防止序列化破坏单例 ，从jdk层面避免
    public HungerSingleton readResolve() {
        return INSTANCE;
    }

    //饿汉式第一种方式；类加载的时候就创建对象
    private static final HungerSingleton INSTANCE = new HungerSingleton();

    public static HungerSingleton getInstance() {
        return INSTANCE;
    }
    //第二种方式

    private static HungerSingleton hungerSingleton = null;

    //类加载的时候就创建对象。了解静态代码块，构造块的区别与加载时机
    static {
        hungerSingleton = new HungerSingleton();
    }

    public static HungerSingleton createInstance() {
        return hungerSingleton;
    }


}
