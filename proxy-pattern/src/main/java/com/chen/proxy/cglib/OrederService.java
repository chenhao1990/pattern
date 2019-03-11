package com.chen.proxy.cglib;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class OrederService {
    //使用动态代理将返回值转为大写
    public String selectCompany() {
        return "alibaba";
    }
}
