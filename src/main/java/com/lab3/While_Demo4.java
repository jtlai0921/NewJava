package com.lab3;

import java.util.Random;

public class While_Demo4 {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 10;
        boolean play = true;
        while (play && count > 0) {            
            int n = r.nextInt(100);
            if(n % 7 != 0) {
                continue;
            }
            System.out.println(n);
            count--;
        }
        
    }
}
