package com.lab6_3;

import static java.util.Comparator.comparing;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/*
    collect() 收集器
    單一元素資料 maxBy
    toList() 元素可以重複的動態陣列(集合)
        [a, b, c, b, c]
    toSet() 元素可以不可重複的動態陣列(集合)
        [a, b, c]
    Map -> key / value
        {a=1, b=2, c=2}
*/
public class Stream_collect {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Watermelon", "Orange", "Banana", "Papaya",
                           "Orange", "Orange", "Apple", "Banana", "Apple", 
                           "Watermelon"};
        // 1.單一元素資料 maxBy
        String max = Stream.of(fruits)
                .collect(maxBy(comparing(name -> name.length()))).get();
        System.out.println(max);
        // 2.toList() 元素可以重複的動態陣列(集合)
        List<Integer> list = Stream.of(fruits)
                            .mapToInt(name -> name.length()) // int, int, int ...
                            .boxed() // Integer, Integer, Integer ...
                            .collect(toList());
        System.out.println(list);
        // 3.toSet() 元素可以不可重複的動態陣列(集合)
        Set<Integer> set = Stream.of(fruits)
                            .mapToInt(name -> name.length()) // int, int, int ...
                            .boxed() // Integer, Integer, Integer ...
                            .collect(toSet());
        System.out.println(set);
        // 4.sorted() 排序
        Stream.of(fruits)
                .sorted()
                .forEach(System.out::print);
        System.out.println();
        List<String> list2 = Stream.of(fruits)
                            .sorted((n1, n2) -> n2.length() - n1.length())
                            .collect(toList());
        System.out.println(list2);
        // 5.分組 groupingBy() Map -> key / value
        Map<String, Long> map = Stream.of(fruits)
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(map);
        // 6.分組/排序
        Map<String, Long> map2 = new LinkedHashMap();
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(x -> map2.put(x.getKey(), x.getValue()));
        System.out.println(map2);
    }
}
