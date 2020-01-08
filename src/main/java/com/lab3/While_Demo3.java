package com.lab3;

import java.util.Random;

public class While_Demo3 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean play = true;
        while (play) {            
            int n = r.nextInt(100);
            if(n % 7 != 0) {
                continue;
            }
            System.out.println(n);
        }
        
    }
}
