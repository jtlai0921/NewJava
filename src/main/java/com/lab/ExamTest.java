package com.lab;

public class ExamTest {
    
    public static void main(String[] args) {
        Exam e = new Exam();
        e.subject = "1z0-808";
        e.score = 100;
        Exam e2 = new Exam();
        e2.subject = "1z0-900";
        e2.score = 50;
        System.out.println(e.subject);
        System.out.println(e.isPass());
        System.out.println(e.toString());
        System.out.println(e2.isPass());
        System.out.println(e2);
    }
}
