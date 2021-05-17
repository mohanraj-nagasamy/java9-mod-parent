import com.test.mo_child_api.api.SomeService;
import com.test.mo_child_service_impl_1.SomeServerImpl1;

module mo.child.service.impl_1 {
    requires mod_api;

    provides SomeService with SomeServerImpl1;
}