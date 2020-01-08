package com.lab4;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 80, 70};
        
        int sum = 0;
        for(int x : scores) {
            sum += x;
        }
        double avg = sum / scores.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
