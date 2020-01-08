package com.lab;

public class DoubleDemo {
    public static void main(String[] args) {
        double h = 170;
        double w = 60;
        //double bmi = w / ((h/100)*(h/100));
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f體重: %.1f bmi=%.2f\n", h, w, bmi);
    }
}
