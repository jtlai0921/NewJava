package com.lab6_2;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> pass = (score) -> score>=60?true:false;
        System.out.println(pass.test(70));
        System.out.println(pass.test(30));
    }
}
