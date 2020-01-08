package com.lab3;

import java.util.Random;

public class IF_Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        int score = r.nextInt(101); // 0~100
        boolean pass = score >= 60;
        System.out.println(score);
        if(pass) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        System.out.println(pass ? "及格" : "不及格");
    }
}
