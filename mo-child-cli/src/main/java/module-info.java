import com.test.mo_child_api.api.SomeService;

//module mo.child.cli {
//}
module mod_cli_x {
    requires mod_api;
//    requires java.logging;
//    requires A;

    uses SomeService;

}