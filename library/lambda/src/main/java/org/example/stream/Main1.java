package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Один");
//        list.add("Два");
//        list.add("Три");
//        list.add("Четыре");
//        list.add("Пять");
//
//        System.out.println(list);
//        List<String> list1 = list.stream().filter(str -> str.length() >= 4).collect(Collectors.toList());
//        System.out.println(list1);
//        list.stream().filter(str -> str.length() >= 4).forEach(s -> System.out.println(s));
//        list.stream().filter(str -> str.contains("О")).forEach(s -> System.out.println(s));

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 12, 33, 4, 5, 61, 7, 38, 9, 10, 9, 9));
        System.out.println(list);

//        list.stream().map(integer -> integer * integer).distinct().sorted().forEach(System.out::println);
//        int i = list.stream().findFirst().get();
//        System.out.println(i);
        System.out.println(list.stream().reduce(Integer::max).get());
    }
}
