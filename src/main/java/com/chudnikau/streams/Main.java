package com.chudnikau.streams;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] strs = { "aaa", "bbb", "ccc" };
        Stream.of(strs).map(String::toUpperCase).forEach(System.out::println);
        Stream.of(strs).flatMap((m) -> Stream.of(m.toUpperCase())).forEach(System.out::println);
    }
}
