package com.lab3;

import java.util.Scanner;

public class DoWhile_Demo2 {
    public static void main(String[] args) {
        int ans = 77;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.println("請輸入數字: ");
            int guess = sc.nextInt();
            if(guess == ans) {
                System.out.println("答對了");
                break;
            }
        } while (true);
    }
}
