package com.lab8_2;

public class PM25 {
    private String area;
    private String value1;
    private String value2;

    public PM25() {
    }

    public PM25(String area, String value1, String value2) {
        this.area = area;
        this.value1 = value1;
        this.value2 = value2;
    }
    
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "PM25{" + "area=" + area + ", value1=" + value1 + ", value2=" + value2 + '}';
    }
    
    
}
