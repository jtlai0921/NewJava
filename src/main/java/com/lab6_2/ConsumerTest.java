package com.lab6_2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer consumer = (t) -> System.out.println(t + "+" + t);
        Stream.of(1, 3, 5, 7).forEach(consumer);
        
        IntConsumer consumer2 = (t) -> System.out.println(t + "+" + t + "=" + (t+t));
        IntStream.of(1, 3, 5, 7, 9).forEach(consumer2);
    }
}
