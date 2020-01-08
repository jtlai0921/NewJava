package com.lab4;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] scores = new int[]{100, 90, 80, 70};
        IntStream.of(100, 90, 80, 70)
                .forEach(x -> System.out.println(x));
                
        int sum = IntStream.of(100, 90, 80, 70).sum();
        long count = IntStream.of(100, 90, 80, 70).count();
        System.out.println(sum);
        System.out.println(sum/count);
        
        IntSummaryStatistics stat = IntStream.of(100, 90, 80, 70)
                .summaryStatistics();
        System.out.println(stat.getAverage());
        System.out.println(stat.getSum());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
    }
}
