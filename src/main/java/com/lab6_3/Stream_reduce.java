package com.lab6_3;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_reduce {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int min = IntStream.of(data).min().getAsInt();
        int max = IntStream.of(data).max().getAsInt();
        int sum = IntStream.of(data).sum();
        double avg = IntStream.of(data).average().getAsDouble();
        System.out.printf("min= %d, max= %d, sum= %d, avg= %.2f\n", min, max, sum, avg);
        
        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        int reduceX = IntStream.of(data).reduce((left, right) -> left + right).getAsInt();
        System.out.println("reduceX= " + reduceX);
        
        int reduceY = IntStream.of(data).reduce(0, (left, right) -> left + right);
        System.out.println("reduceY= " + reduceY);
        
        Stream.iterate(0, n -> n + 1).limit(10).forEach(System.out::println);
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .forEach(n -> {
                    System.out.println("n[0]=" + n[0] + ", n[1]=" + n[1]);
                });
        
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);
    }
}
