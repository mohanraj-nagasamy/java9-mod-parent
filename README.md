
```shell
jar tf mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar
jar tf mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar

java -cp mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar com.test.mo_child_api.App
java -cp mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar com.test.mo_child_cli.App
```

```shell
 java --module-path mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar -m A/com.test.mo_child_api.App 
```