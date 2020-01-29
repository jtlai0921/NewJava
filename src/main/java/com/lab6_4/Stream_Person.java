package com.lab6_4;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Stream;

public class Stream_Person {
    public static void main(String[] args) {
        List<Person> list = PersonUtil.getJavaProgrammers();
        list.addAll(PersonUtil.getPHPProgrammers());
        
        //1.列出所有程式工程師的資料
        System.out.println("1.列出所有程式工程師的資料");
        list.stream().forEach(System.out::print);
        //2.給程式工程師加薪 5%
        System.out.println("\n2.給程式工程師加薪 5%");
        Consumer<Person> raiseSalary = p -> p.setSalary((int)(p.getSalary() * 1.05));
        list.stream().forEach(raiseSalary);
        list.stream().forEach(System.out::print);
        //3.列出薪資超過 1400 的程式工程師
        System.out.println("\n3.列出薪資超過 1400 的程式工程師");
        list.stream()
                .filter(p -> p.getSalary() > 1400)
                .forEach(System.out::print);
        //4.年齡大於35歲且月薪在1400以上的女性PHP程式工程師
        System.out.println("\n4.年齡大於35歲且月薪在1400以上的女性PHP程式工程師");
        list.stream()
                .filter(p -> p.getAge() > 35)
                .filter(p -> p.getSalary() > 1400)
                .filter(p -> p.getGender().equals("female"))
                .filter(p -> p.getJob().contains("PHP"))
                .forEach(System.out::print);
        
        //5.根據年齡排序顯示前5個Java程式工程師
        System.out.println("\n5.根據年齡排序顯示前5個Java程式工程師");
        list.stream()
                .filter(p -> p.getJob().contains("Java"))
                .sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .limit(5)
                .forEach(System.out::print);
        //6.根據薪資排序列出所有程式工程師(由大->小排序)
        System.out.println("\n6.根據薪資排序列出所有程式工程師(由大->小排序)");
        list.stream()
                .sorted((p1, p2) -> p2.getSalary()- p1.getSalary())
                .forEach(System.out::print);
        //7.工資最低與最高的程式工程師
        System.out.println("\n7.工資最低與最高的程式工程師");
        Person p_min = list.stream().min((p1, p2) -> p1.getSalary() - p2.getSalary()).get();
        System.out.println("工資最低: " + p_min);
        Person p_max = list.stream().max((p1, p2) -> p1.getSalary() - p2.getSalary()).get();
        System.out.println("工資最高: " + p_max);
        //8.Java與php工程師的薪資統計資料
        System.out.println("\n8.Java與php工程師的薪資統計資料");
        IntSummaryStatistics java_stat = list.stream()
                .filter(p -> p.getJob().contains("Java"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics();
        System.out.println("Java 統計資料:" + java_stat);
        IntSummaryStatistics php_stat = list.stream()
                .filter(p -> p.getJob().contains("PHP"))
                .mapToInt(p -> p.getSalary())
                .summaryStatistics();
        System.out.println("PHP 統計資料:" + php_stat);
        //9.根據性別來分組並計算出薪資統計資料
        System.out.println("\n9.根據性別來分組並計算出薪資統計資料");
        Map<String, List<Person>> map = list.stream().collect(groupingBy(Person::getGender));
        System.out.println(map);
        System.out.println(map.get("female"));
        System.out.println(map.get("male"));
        
        System.out.println("female: " + map.get("female").stream().mapToInt(p->p.getSalary()).summaryStatistics());
        System.out.println("male: " + map.get("male").stream().mapToInt(p->p.getSalary()).summaryStatistics());
    }
}
