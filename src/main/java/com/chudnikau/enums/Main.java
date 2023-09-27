package com.chudnikau.enums;

enum Cars {
    Ford,
    BMW,
    VW,
    Volvo
}

public class Main {
    public static void main(String[] args) {
        for (Cars c : Cars.values()) {
            System.out.println(c + " " + c.ordinal());
        }
//        System.out.println(Arrays.toString(Cars.values()));

        for (Cars c : Cars.values()) {
            switch (c) {
                case BMW -> System.out.println("BMW");
                case VW -> System.out.println("VW");
                default -> System.out.println("Unknown car");
            }
        }
    }
}
