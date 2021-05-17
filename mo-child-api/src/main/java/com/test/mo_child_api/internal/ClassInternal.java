package com.test.mo_child_api.internal;

public class ClassInternal {
    static {
        System.out.println("ClassInternal.static initializer");
    }
    public void call(String s) {
        System.out.println("ClassInternal.call");
        System.out.println("s = " + s);
    }
}
