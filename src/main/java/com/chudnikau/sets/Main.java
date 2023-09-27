package com.chudnikau.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Pet {
    private String name;
    private Integer age;

    Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Pet> cats = new HashSet<>();
        cats.add(new Pet("Narsik", 1));
        cats.add(new Pet("Richi", 2));
        cats.add(new Pet("Kuza", 3));
        cats.add(new Pet("Kuza", 3));
        cats.add(new Pet("Kuza", 3));

        Iterator<Pet> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Pet p = iterator.next();
            System.out.println(p.getName());
        }
        /*
        Kuza
        Narsik
        Richi
        Kuza
        Kuza
         */

        for (Pet p : cats) {
            System.out.println(p.getName());
        }
        /*
        Kuza
        Narsik
        Richi
        Kuza
        Kuza
         */
    }
}
