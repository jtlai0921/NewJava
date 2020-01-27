package com.lab6_3;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Stream_Filter {
    public static void main(String[] args) {
        
        String[] names = {"Apple", "John", "Jo", "Vincent", "Anita"};
        // 外部迭代
        for(String name : names) {
            // 名字長度 >= 5
            if(name.length() >= 5) {
                System.out.println(name);
            }
        }
        System.out.println("-------------");
        // 內部迭代
        Predicate<String> nameLengthThanFive = name -> name.length() >= 5;
        Predicate<String> firstNameChar = name -> name.charAt(0) == 'V';
        
        Stream.of(names)
                .filter(nameLengthThanFive)
                .filter(firstNameChar)
                //.forEach(name -> System.out.println(name));
                .forEach(System.out::println);
        long count = Stream.of(names)
                .filter(nameLengthThanFive)
                .filter(firstNameChar)
                .count();
        System.out.println(count);
    }
}
