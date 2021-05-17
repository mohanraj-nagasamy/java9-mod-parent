package com.test.mo_child_service_impl_1;

import com.test.mo_child_api.api.ClassA;
import com.test.mo_child_api.api.SomeService;
//import com.test.mo_child_api.model.Person;
//import com.test.mo_child_api.model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        SomeService service = new SomeServerImpl1();
        System.out.println("Hello " + service.giveMeSomeThing() + "!");
        ClassA classA = new ClassA();
        System.out.println("classA.yearPublic = " + classA.yearPublic);
//        Person person = new Person();

        Object newInstance = Class.forName("com.test.mo_child_api.internal.ClassInternal")
                .getDeclaredConstructor()
                .newInstance();
        System.out.println("newInstance = " + newInstance);
//
//        Object newPerson = Class.forName("com.test.mo_child_api.model.Person")
//                .getDeclaredConstructor()
//                .newInstance();
//        System.out.println("newPerson = " + newPerson);

//        ClassInternal classInternal = (ClassInternal) newInstance;
//        System.out.println("classInternal = " + classInternal);

//        Person person = (Person) newPerson;
//        System.out.println("person = " + person);
    }
}
