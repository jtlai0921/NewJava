package com.lab4;

public class MultiArrayDemo5 {
    public static void main(String[] args) {
        int[][] scores =  {{100, 90, 80}, {90, 70, 60}, {100, 100, 95}}; // 3*3
        for(int[] score : scores) {
            int sum = getSum(score);
            double avg = getAvg(score);
            System.out.printf("sum: %d avg: %.2f\n", sum, avg);
        }
    }
    
    public static int getSum(int [] score) {
        int sum = 0;
        for(int x : score) {
            sum += x;
        }
        return sum;
    }
    
    public static double getAvg(int [] score) {
        int sum = getSum(score);
        double avg = sum / (double)score.length;
        return avg;
    }
    
}
