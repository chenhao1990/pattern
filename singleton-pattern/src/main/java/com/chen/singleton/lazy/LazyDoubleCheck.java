package com.chen.singleton.lazy;

/**
 * @author ：chenhao
 * @Date : 2019/3/10
 * @description : 懒汉式双重检查锁
 */
public class LazyDoubleCheck {
    private LazyDoubleCheck() {
        if (single != null) {
            throw new RuntimeException("对象已存在");
        }
    }

    public LazyDoubleCheck readResolve() {
        return single;
    }

    //volatile关键字 防止指令重排序，保证有有序性和可见性
    private volatile static LazyDoubleCheck single = null;

    public static LazyDoubleCheck getInstance() {
        if (single == null) {
            //同步保证线程安全
            synchronized (LazyDoubleCheck.class) {
                if (single == null) {
                    single = new LazyDoubleCheck();
                }
            }
        }
        return single;
    }

}
