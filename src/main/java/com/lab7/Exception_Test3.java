package com.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Test3 {

    public static void main(String[] args) {
        try {
            play();
        } catch (Exception e) {
            System.out.println("錯誤類別: " + e.getClass().getName());
        }
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字: ");
        int x = sc.nextInt();
        System.out.printf("%s 的平方 = %.1f\n", x, Math.pow(x, 2));
    }
}
