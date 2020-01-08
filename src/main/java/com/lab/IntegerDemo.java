package com.lab;

public class IntegerDemo {

    public static void main(String[] args) {
        System.out.println("Java" + 1 + 7); // "Java17"
        System.out.println("Java" + (1 + 7)); // "Java8"
        int var = 10;
        //int age = ++var; // 前序遞增 運行步驟: 1. var = var + 1  2. age = var
        //int age = var++; // 後序遞增 運行步驟: 1. age = var      2. var = var + 1
        //int age = --var; // 前序遞減 運行步驟: 1. var = var - 1  2. age = var
        int age = var--; // 後序遞減 運行步驟: 1. age = var      2. var = var - 1
        System.out.println(var);
        System.out.println(age);
        
        int r = 1/2; // 0.5 取整數 0
        System.out.println(r);
    }
}
