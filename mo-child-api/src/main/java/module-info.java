//module mo.child.api
//module com.test.mo_child_api

module mod_api {
//    requires java.logging;
    requires transitive java.logging;
//
    opens com.test.mo_child_api.internal;
//
    exports com.test.mo_child_api.api;
    exports com.test.mo_child_api.model to mod_cli_x;

}