package com.chudnikau.overloading;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        System.out.println("Integer=" + tree.height());
        System.out.println("String=" + tree.height(100));
        System.out.println(tree.height((short) 100));
        System.out.println(tree.height(100));
        System.out.println(tree.height((long) 100));
        System.out.println(tree.height((Integer) 100));

    }
}
