package com.test.mo_child_api.model;

public class Person {
    private final String name;
    private final int age;

    public Person() {
        this(null, 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
