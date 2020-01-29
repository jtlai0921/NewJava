package com.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("假設分子是10, 請輸入一個數字用來當分母: ");
        try {
            int x = sc.nextInt();
            int avg = 10 / x;
            System.out.printf("10/%d = %d\n", x, avg);
        } catch (ArithmeticException e) {
            System.out.println("錯誤發生, 錯誤原因: " + e.getMessage());
            e.printStackTrace(System.out);
        } catch(InputMismatchException e) {
            System.out.println("必須輸入數字");
            e.printStackTrace(System.out);
        } catch(Exception e) {
            System.out.println("其他錯誤");
            System.out.println("錯誤類型: " + e.getClass());
        }
        System.out.println("程式結束");
    }
}
