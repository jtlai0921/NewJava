package com.lab8;

import com.google.gson.Gson;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BadRice_Search2 {
    public static void main(String[] args) throws Exception {
        String jsonString = BadRice_Search.getJsonString();
        Gson gson = new Gson();
        BadRice[] badRices = gson.fromJson(jsonString, BadRice[].class);
        
        Predicate<BadRice> f1 = b -> b.品名.contains("池上");
        Stream.of(badRices)
                .filter(f1)
                .forEach(System.out::println);
        long count = Stream.of(badRices).filter(f1).count();
        System.out.println("筆數: " + count);
    }
}
