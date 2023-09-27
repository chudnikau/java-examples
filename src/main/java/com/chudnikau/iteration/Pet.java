package com.chudnikau.iteration;

public class Pet {
    private String name;
    private Integer age;

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pet name is " + name + "; Pet age is " + age;
    }
}
