package com.lab;

public class BooleanDemo {
    public static void main(String[] args) {
        int score = 95;
        boolean pass = score >= 60;
        System.out.printf("pass: %b\n", pass);
        // pass ? "及格" : "不及格"  
        System.out.println(pass ? "及格" : "不及格");
        System.out.printf("考試分數: %d (%s) \n", score, pass ? "及格" : "不及格");
    }
}
