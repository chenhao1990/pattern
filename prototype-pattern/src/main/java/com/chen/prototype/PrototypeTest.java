package com.chen.prototype;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException, ParseException {
        Address address = new Address();
        address.setProvince("四川");
        address.setCity("成都");
        address.setCounty("高新区");
        address.setCityCode(510117);
        Person p = new Person();
        p.setAddress(address);
        p.setAge(28);
        p.setName("chenhao");
        p.setBirthDay(new Date());

        System.out.println(p);

        Person clone = (Person) p.clone();
        clone.setBirthDay(DateFormat.getDateInstance().parse("1990-9-9"));
        Address addr = new Address();
        addr.setCityCode(510118);
        addr.setProvince("sichuan");
        addr.setCity("chengdu");
        addr.setCounty("shuangliu");
        clone.setAddress(addr);
        System.out.println(clone);
    }

}
