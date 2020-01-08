package com.lab3;

import java.util.Scanner;

public class DoWhile_Demo3 {
    public static void main(String[] args) {
        int ans = 77;
        int min = 0;
        int max = 100;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("請輸入數字(%d ~ %d):\n", min, max);
            int guess = sc.nextInt();
            if(guess > ans) {
                max = guess;
            } else if(guess < ans) {
                min = guess;
            } else {
                System.out.println("答對了");
                break;
            }
        } while (true);
    }
}
