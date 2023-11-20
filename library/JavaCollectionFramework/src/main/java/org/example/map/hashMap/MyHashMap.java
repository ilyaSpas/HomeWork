package org.example.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Один");
        map.put(2,"Два");
        map.put(3,"Три");
        map.put(4,"Четыре");
        map.put(1,"1");
        map.put(1,"2");
        map.put(1,"3");

        System.out.println(map);
    }
}
