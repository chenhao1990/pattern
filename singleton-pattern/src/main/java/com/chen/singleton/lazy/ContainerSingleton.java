package com.chen.singleton.lazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：chenhao
 * @Date : 2019/3/10
 * @description : 注册式单例
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    public static Object getInstance(String className) {
        Object obj = null;
        //同步保证线程安全
        synchronized (map) {
            if (obj == null) {
                try {
                    obj = Class.forName(className).newInstance();
                    map.putIfAbsent(className, obj);
                    return obj;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return map.get(className);
    }
}
