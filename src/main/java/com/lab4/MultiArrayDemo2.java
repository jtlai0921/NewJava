package com.lab4;

public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int[][] scores =  {{100, 90, 80}, {90, 70, 60}}; // 2*3
        // scores[0] -> {100, 90, 80}
        int sum1 = 0;
        for(int x : scores[0]) {
            sum1 += x;
        }
        System.out.println(sum1);
        
        // scores[1] -> {90, 70, 60}
        int sum2 = 0;
        for(int x : scores[1]) {
            sum2 += x;
        }
        System.out.println(sum2);
    }
}
