package com.lab4;

public class MultiArrayDemo1 {
    public static void main(String[] args) {
        int[] score1 = {100, 90, 80};
        int[] score2 = {90, 70, 60};
        
        int[][] scores =  {{100, 90, 80}, {90, 70, 60}}; // 2*3
        System.out.println(scores.length); // 2
        System.out.println(scores[0].length); // 3
        System.out.println(scores[1].length); // 3
        System.out.println(scores[0][0]); // 100
        System.out.println(scores[0][2]); // 80
        System.out.println(scores[1][1]); // 70
    }
}
