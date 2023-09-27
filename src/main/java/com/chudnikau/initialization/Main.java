package com.chudnikau.initialization;

public class Main {

    static int p;

    private int m;

    static {
        p = 100;
//        m = 200;   // ошибка. В блоке static разрешено инициализировать только статические переменные
    }

    private static String staticString = initStaticString();

    static {
        System.out.println("Static block is initialized");
    }

    private String s = "String";

    private Integer i = f();

    private Integer f() {
        System.out.println("Object variable is initialized");
        return 1;
    }

    Main() {
        i = 100;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getI());
    }

    private Integer getI() {
        return i;
    }

    private static String initStaticString() {
        System.out.println("initStaticString()");
        return "Static value is initialized";
    }
}
