package com.lab4;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        int[][] scores =  {{100, 90, 80}, {90, 70, 60}, {100, 100, 95}}; // 3*3
        for(int i=0;i<scores.length;i++) {
            printSum(scores[i]);
        }
        for(int[] score : scores) {
            printSum(score);
        }
    }
    
    public static void printSum(int [] score) {
        int sum = 0;
        for(int x : score) {
            sum += x;
        }
        System.out.println(sum);
    }
}
