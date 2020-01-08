package com.lab3;

import java.util.Random;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        // for loop
        for(int i=0;i<4;i++) {
            int n = new Random().nextInt(10);
            System.out.println(i + " : " + n);
        }
        
        for(int i=4;i>0;i--) {
            int n = new Random().nextInt(10);
            System.out.println(i + " : " + n);
        }
        
    }
}
