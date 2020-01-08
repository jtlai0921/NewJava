package com.lab;

public class DataType {
    static int x; // 類別變數(公用)
    int y; // 物件變數(個別物件自行使用)
    
    public static void main(String[] args) {
        int z; // 區域變數
        System.out.println(x); // 直接取類別變數
        System.out.println(DataType.x); // 直接取類別變數
        DataType dt = new DataType();
        System.out.println(dt.y); // 物件變數取值
        DataType dt2 = new DataType();
        System.out.println(dt2.y); // 物件變數取值
        z = 0;
        System.out.println(z); // 區域變數取值
    }
}
