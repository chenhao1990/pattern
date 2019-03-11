package com.chen.proxy.jdk;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description : 罪犯打官司
 */
public class Offender implements Lawsuit {
    @Override
    public void process() {
        System.out.println("罪犯打官司");
    }
}
