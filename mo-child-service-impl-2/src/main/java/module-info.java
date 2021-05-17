import com.test.mo_child_api.api.SomeService;
import com.test.mo_child_service_impl_2.SomeServerImpl2;

module mo.child.service.impl_2 {
    requires mod_api;
    provides SomeService with SomeServerImpl2;
}