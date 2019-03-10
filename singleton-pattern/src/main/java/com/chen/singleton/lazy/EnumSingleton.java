package com.chen.singleton.lazy;

/**
 * @author ：chenhao
 * @Date : 2019/3/10
 * @description : 枚举式单例天生线程安全，jdk底层限制
 */
public class EnumSingleton {

    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getsingle();
    }

    private static enum Singleton {

        INSTANCE;

        private EnumSingleton enumSingleton;

        private Singleton() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getsingle() {
            return enumSingleton;
        }
    }

}
