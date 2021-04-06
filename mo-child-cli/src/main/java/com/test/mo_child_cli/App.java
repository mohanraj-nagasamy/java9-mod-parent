package com.test.mo_child_cli;

import com.test.mo_child_api.ClassA;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassA classA = new ClassA();
        int yearPublic = classA.yearPublic;
        System.out.println("yearPublic = " + yearPublic);
    }
}
