package com.lab3;

public class ForEachDemo2 {
    public static void main(String[] args) {
        int[] scores = {100, 80, 90}; // 陣列
        int sum = 0;
        for(int x : scores) {
            System.out.println(x);
            sum += x; // sum = sum + x;
        }
        System.out.printf("sum: %d avg: %d\n", sum, sum/scores.length);
    }
}
