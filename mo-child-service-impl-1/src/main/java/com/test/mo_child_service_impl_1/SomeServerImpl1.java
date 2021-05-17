package com.test.mo_child_service_impl_1;

import com.test.mo_child_api.api.SomeService;

public class SomeServerImpl1 implements SomeService {
    @Override
    public String giveMeSomeThing() {
        System.out.println("SomeServerImpl1.giveMeSomeThing");
        return "Tea";
    }
}
