package com.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入數字: ");
        try {
            int x = sc.nextInt();
            System.out.printf("%s 的平方 = %.1f\n", x, Math.pow(x, 2));
        } catch (InputMismatchException e) {
            System.out.printf("請輸入數字, 錯誤原因: %s\n", e.getMessage());
            e.printStackTrace(System.out);
        }
        
    }
}
