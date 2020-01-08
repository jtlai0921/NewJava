package com.lab3;

import java.util.Random;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10) {
            int n = new Random().nextInt(100);
            System.out.println(count + " : " + n);
            count++;
        }
        // for loop
        for(int i=0;i<10;i++) {
            int n = new Random().nextInt(100);
            System.out.println(i + " : " + n);
        }
        
    }
}
