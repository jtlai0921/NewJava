package com.lab;

import java.math.BigDecimal;

public class DoubleDemo2 {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.1);
        System.out.println(0.1 + 0.1 == 0.2);
        System.out.println(0.1 + 0.1 + 0.1);
        System.out.println(0.1 + 0.1 + 0.1 == 0.3);
        
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        BigDecimal d = a.add(b).add(c);
        System.out.println(d.doubleValue());
        System.out.println(d.doubleValue() == 0.3);
    }
}
