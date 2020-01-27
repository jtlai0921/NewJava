package com.lab6_2;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.stream.DoubleStream;

public class FunctionTest {
    public static void main(String[] args) {
        DoubleFunction func1 = (r) -> Math.pow(r, 2) * Math.PI;
        System.out.println(func1.apply(5.31));
        System.out.println(func1.apply(9));
        
        BiFunction<Integer, Integer, Long> func2 = (x, y) -> (long)(x * y);
        System.out.println(func2.apply(1000000, 5000000));
        
        Function<Integer, Double> func3 = (r) -> Math.pow(r, 2) * Math.PI;
        System.out.println(func3.apply(10));
    }
}
