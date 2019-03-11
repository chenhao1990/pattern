package com.chen.proxy.jdk;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        Lawsuit lawsuit = (Lawsuit) new Lawyer().getInstance(new Offender());
        lawsuit.process();

    }
}
