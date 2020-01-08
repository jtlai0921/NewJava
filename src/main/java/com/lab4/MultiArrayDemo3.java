package com.lab4;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        int[][] scores =  {{100, 90, 80}, {90, 70, 60}, {100, 100, 95}}; // 3*3
        // scores[0] -> {100, 90, 80}
        printSum(scores[0]);
        // scores[1] -> {90, 70, 60}
        printSum(scores[1]);
        // scores[2] -> {100, 100, 95}
        printSum(scores[2]);
    }
    
    public static void printSum(int [] score) {
        int sum = 0;
        for(int x : score) {
            sum += x;
        }
        System.out.println(sum);
    }
}
