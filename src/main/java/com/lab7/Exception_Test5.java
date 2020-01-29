package com.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception_Test5 {

    public static void main(String[] args) {
        try {
            play();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            main(null);
        }
    }

    public static void play() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入偶數: ");
        int x = sc.nextInt();
        if(x % 2 == 1) {
            // RuntimeException, Error -> unchecked exception 非受檢例外
            // 其他例外錯誤              -> checked exception 受檢例外
            Exception e = new Exception(x + " 不是偶數, 請重新輸入");
            throw e;
        }
        System.out.printf("得到偶數 %d", x);
    }
}
