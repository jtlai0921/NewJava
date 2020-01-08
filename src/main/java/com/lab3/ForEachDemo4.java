package com.lab3;

import java.util.IntSummaryStatistics;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class ForEachDemo4 {
    public static void main(String[] args) {
        int[] scores = {100, 30, 50, 85, 90}; // 陣列
        int sum = 0;
        for(int x : scores) {
            if(x >= 60) {
                sum += x;
            }
        }
        System.out.println(sum);
        
        // Java 8
        IntPredicate pass = x -> x >= 60;
        IntPredicate odd = x -> x % 2 == 0;
        IntPredicate fail = x -> x < 60;
        int sum2 = IntStream.of(scores)
                            .filter(pass)
                            .filter(odd)
                            //.peek(x -> System.out.println("x=" + x))
                            .sum();
        System.out.println(sum2);
    }
}
