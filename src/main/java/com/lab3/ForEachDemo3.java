package com.lab3;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class ForEachDemo3 {
    public static void main(String[] args) {
        //int[] scores = {100, 80, 90}; // 陣列
        int    sum = IntStream.of(100, 80, 90).sum();
        double avg = IntStream.of(100, 80, 90).average().getAsDouble();
        long count  = IntStream.of(100, 80, 90).count();
        System.out.printf("sum: %d avg: %.2f count: %d\n", sum, avg, count);
        IntSummaryStatistics stat = IntStream.of(100, 80, 90).summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
        System.out.println(stat.getCount());
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
    }
}
