package com.lab3;

import java.util.Scanner;

public class IF_Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("170,60").useDelimiter(",");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("身高: %.1f 體重: %.1f BMI: %.2f\n", h, w, bmi);
        // 18~23 正常
        if(bmi >= 18 && bmi <= 23) {
            System.out.println("正常");
        } else if(bmi > 23) {
            System.out.println("過胖");
        } else {
            System.out.println("過瘦");
        }
        
    }
}
