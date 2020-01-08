package com.lab3;

import java.util.Random;

public class While_Demo1 {
    public static void main(String[] args) {
        Random r = new Random();
        while (true) {            
            int n = r.nextInt(100);
            System.out.println(n);
            if(n % 7 == 0) {
                break;
            }
        }
        
    }
}
