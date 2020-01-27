package com.lab6_3;

import java.util.stream.Stream;

public class Stream_map {
    public static void main(String[] args) {
        String[] names = {"Apple", "John", "Jo", "Vincent", "Anita"};
                         // 5, 4, 2, 7, 5
        Stream.of(names)
                .map(name -> name.length())
                .forEach(System.out::println);
        
        int sum = Stream.of(names)
                    .mapToInt(name -> name.length())
                    .sum();
        System.out.println(sum);
    }
}
