package com.lab3;

import java.util.Random;

public class While_Demo2 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean play = true;
        while (play) {            
            int n = r.nextInt(100);
            System.out.println(n);
            if(n % 7 == 0) {
                play = false;
            }
        }
        
    }
}
