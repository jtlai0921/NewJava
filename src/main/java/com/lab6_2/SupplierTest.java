package com.lab6_2;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> lucky = () -> new Random().nextInt(100);
        System.out.println(lucky.get());
    }
}
