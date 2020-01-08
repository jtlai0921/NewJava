package com.lab3;

public class ForEachDemo1 {
    public static void main(String[] args) {
        int[] scores = {100, 80, 90}; // 陣列
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[0] + scores[1] + scores[2]);
        System.out.println("----------");
        for(int i=0;i<=2;i++) {
            System.out.println(scores[i]);
        }
        System.out.println("----------");
        for(int i=0;i<=scores.length-1;i++) {
            System.out.println(scores[i]);
        }
        System.out.println("----------");
        for(int i=0;i<scores.length;i++) {
            System.out.println(scores[i]);
        }
        System.out.println("----------");
        for(int x : scores) {
            System.out.println(x);
        }
    }
}
