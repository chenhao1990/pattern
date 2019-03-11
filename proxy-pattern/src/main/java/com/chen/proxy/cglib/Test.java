package com.chen.proxy.cglib;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        OrederService service= (OrederService) new CglibProxy(new OrederService()).getInstance();
        String s = service.selectCompany();
        System.out.println(s);
    }
}
