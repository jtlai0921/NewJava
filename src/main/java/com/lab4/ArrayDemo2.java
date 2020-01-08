package com.lab4;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 80, 70};
        int sum = scores[0] + scores[1] + scores[2] + scores[3];
        double avg = sum / scores.length;
        System.out.println(sum);
        System.out.println(avg);
    }
}
