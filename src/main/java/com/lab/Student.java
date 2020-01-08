package com.lab;

public class Student {
    String name = "John";
    int studentOfAge = 18;
    char char_sex = 'M'; // 匈牙利命名法
    
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.studentOfAge);
        s.studentOfAge = s.studentOfAge + 1;
        System.out.println(s.studentOfAge);
        System.out.println(s.char_sex);
    }
}
