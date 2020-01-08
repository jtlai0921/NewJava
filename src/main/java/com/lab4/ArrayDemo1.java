package com.lab4;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 80;
        
        int sum = scores[0] + scores[1] + scores[2];
        double avg = sum / 3;
        System.out.println(sum);
        System.out.println(avg);
    }
}
