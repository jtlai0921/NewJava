package com.lab6_3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream_flatmap {
    public static void main(String[] args) {
        String[] names1 = {"Apple", "John", "Jo", "Vincent", "Anita"};
        String[] names2 = {"Tom", "Happy", "KD", "Java", "Python"};
        // {"Apple", "John", "Jo", "Vincent", "Anita", "Tom", "Happy", "KD", "Java", "Python"}
        Stream.of(names1, names2)
                .flatMap(names -> Arrays.stream(names)) // Stream.of(names)
                .forEach(System.out::println);
        
        Stream.of(names1, names2)
                .flatMap(names -> Arrays.stream(names))
                .mapToInt(name -> name.length())
                .forEach(System.out::println);
    }
}
