package com.lab3;

import java.util.Scanner;

public class IF_Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("190,60").useDelimiter(",");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        // 18~23 正常
        if(bmi >= 18 && bmi <= 23) {
            System.out.println("正常");
        } else {
            System.out.println("過瘦/過胖");
        }
        
    }
}
