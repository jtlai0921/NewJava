package com.lab;

public class BooleanDemo2 {
    public static void main(String[] args) {
        double h = 170;
        double w = 60;
        double bmi = w / Math.pow(h/100, 2);
        // bmi < 18 過瘦
        // bmi > 23 過胖
        // 其他則是正常
        System.out.println(bmi);
        // (bmi < 18) ? "過瘦" : ((bmi > 23) ? "過胖" : "正常")
        System.out.println((bmi < 18) ? "過瘦" : ((bmi > 23) ? "過胖" : "正常"));
    }
}
