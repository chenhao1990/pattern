package com.chen.prototype;

import java.io.Serializable;

/**
 * @author ：chenhao
 * @Date : 2019/3/11
 * @description :
 */
public class Address implements Cloneable,Serializable {

    //省
    private String province;
    //市
    private String city;
    //县
    private String county;
    //行政区划代码
    private int cityCode;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", cityCode=" + cityCode +
                '}';
    }
}
