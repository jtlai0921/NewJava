package com.lab7;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exception_Test4 {

    public static void main(String[] args) throws Exception {
        play();
        try {
            play();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void play() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入身分證字號: ");
        String id = sc.next();
        if(id.length() != 10) {
            // RuntimeException, Error -> unchecked exception 非受檢例外
            // 其他例外錯誤              -> checked exception 受檢例外
            Exception e = new Exception("身份證字號長度不正確");
            throw e;
        }
        System.out.printf("id = %s 長度正確\n", id);
    }
}
