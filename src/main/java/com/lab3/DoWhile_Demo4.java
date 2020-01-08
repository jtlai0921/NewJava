package com.lab3;

import java.util.Random;
import java.util.Scanner;

public class DoWhile_Demo4 {
    public static void main(String[] args) {
        int ans = new Random().nextInt(99) + 1; // 0~98 + 1 -> 1~99
        int min = 0;
        int max = 100;
        do {            
            Scanner sc = new Scanner(System.in);
            System.out.printf("請輸入數字(%d ~ %d):\n", min, max);
            int guess = sc.nextInt();
            // 數字是否合法驗證 ?
            if(!(guess > min && guess < max)) {
               System.out.println("數字範圍錯誤, 請重新輸入 !");
               continue;
            }
            // 是否答對 ?
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
