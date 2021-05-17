package com.test.mo_child_cli;


import com.test.mo_child_api.api.ClassA;
import com.test.mo_child_api.api.SomeService;
import com.test.mo_child_api.model.Person;

import java.util.ServiceLoader;
import java.util.logging.Logger;

public class App {

    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        serviceLoader();

//        reflections();
    }

    private static void reflections() throws Exception {
        ClassA classA = new ClassA();
        Object newInstance = Class.forName("com.test.mo_child_api.internal.ClassInternal")
                .getDeclaredConstructor()
                .newInstance();
        System.out.println("newInstance = " + newInstance);

        Person person = new Person("name", 12);
        System.out.println("person = " + person);
//        ClassInternal classInternal = new ClassInternal();
//        System.out.println("classInternal = " + classInternal);

        int yearPublic = classA.yearPublic;
        logger.info("yearPublic = " + yearPublic);
    }

    static void serviceLoader() {
        System.out.println("App.serviceLoader");
        Iterable<SomeService> someServices = ServiceLoader.load(SomeService.class);

        someServices.forEach(someService -> {
            String someThing = someService.giveMeSomeThing();
            System.out.println("someThing = " + someThing);
        });

    }
}
