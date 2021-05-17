package com.test.mo_child_service_impl_2;

import com.test.mo_child_api.api.ClassA;
import com.test.mo_child_api.api.SomeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SomeService service = new SomeServerImpl2();
        System.out.println("Hello " + service.giveMeSomeThing() + "!");
        ClassA classA = new ClassA();
        System.out.println("classA.yearPublic = " + classA.yearPublic);

    }
}
