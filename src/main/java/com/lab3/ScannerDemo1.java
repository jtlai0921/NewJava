package com.lab3;
import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("170.0 60.5");
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        double bmi = w / Math.pow(h/100, 2);
        System.out.printf("%.1f, %.1f, %.2f\n", h, w, bmi);
    }
}
