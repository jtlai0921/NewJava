package com.lab;

public class Exam {
    String subject; // 考試科目
    int score; // 考試成績
    
    public boolean isPass() {
        return (score >= 60) ? true : false;
    }

    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }

}
