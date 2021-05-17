package com.test.mo_child_service_impl_2;

import com.test.mo_child_api.api.SomeService;

public class SomeServerImpl2 implements SomeService {
    @Override
    public String giveMeSomeThing() {
        System.out.println("SomeServerImpl2.giveMeSomeThing");
        return "Coffee";
    }
}
