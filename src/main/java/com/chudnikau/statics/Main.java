package com.chudnikau.statics;

public class Main {

    private int i; // переменная сохраняется в heap и инициализируется 0
    public static void main(String[] args) {
        Main main = new Main();
        main.classPrint();
        int k = 0; // переменная сохраняется в stack и должна быть инициализирована 0 вручную
        k++;
        System.out.println("k has value = " + k);
    }

    public static void staticPrint() {
        System.out.println("print static text");
    }

    public void classPrint() {
        i++;
        staticPrint();
        System.out.println("print class text=" + i);
    }
}
