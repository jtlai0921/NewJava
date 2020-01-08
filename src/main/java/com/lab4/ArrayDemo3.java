package com.lab4;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 80, 70};
        
        int sum = 0;
        for(int i=0;i<scores.length;i++) {
            sum += scores[i];
        }
        double avg = sum / scores.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
