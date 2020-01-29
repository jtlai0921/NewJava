package com.lab6_3;

import java.util.stream.IntStream;

public class Stream_find {
    public static void main(String[] args) {
        int[] data = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        int x = IntStream.of(data).filter(n -> isEven(n)).parallel().findAny().getAsInt();
        System.out.println(x);
        int x2 = IntStream.of(data).filter(n -> isEven(n)).parallel().findFirst().getAsInt();
        System.out.println(x2);        
        
        boolean b = IntStream.of(data).anyMatch(n -> isPrime(n));
        System.out.println(b);
        
        boolean b2 = IntStream.of(data).allMatch(n -> isPrime(n));
        System.out.println(b2);
        
        boolean b3 = IntStream.of(data).noneMatch(n -> n < 0);
        System.out.println(b3);
    }
    
    public static boolean isEven(int n) { // 偶數判斷
        return n % 2 == 0;
    }
    
    public static boolean isPrime(int n) { // 質數判斷
        if (n <= 1) return false;
        return !IntStream.rangeClosed(2, n / 2).anyMatch(i -> n % i == 0);
    }
}
