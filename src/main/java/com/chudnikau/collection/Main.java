package com.chudnikau.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "V1");
        map.put("2", "V2");

        System.out.println(List.of(map));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Set<Integer> setList = new HashSet<>();
        setList.add(1);
        setList.add(1);
        setList.add(2);

        System.out.println(setList);

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            linkedList.add(linkedList.size() % 2, i);
        }

        System.out.println(linkedList);

        for (Integer listValue : linkedList) {
            System.out.println("listValue=" + listValue);
        }

    }
}
