# Java module - example project 

## Java without Module
* Statements > Methods > Classes > Packages > Jar
* All the public classes are accessible outside the packages
* No control access for public classes 
* No idea which class uses what in the world 

## Java with Module
* Next Level of Abstraction for Java
    * Statements > Methods > Classes > Packages > Module > Jar  
* Groups related packages
* A module has a name, it groups related code and is self-contained
* Declare and describe dependencies

## Jar files and the classpath
* JVM loads all the classes in the classpath
* doesn't describe dependencies

## Why?
* Understandability: clear and explicit dependencies
* Ease to maintain in the long run
* Provides flexibility to decouple different parts of the system
* Provides strong encapsulation: hind the API internals 
* Explicit dependencies 

## How To-do's
 * How to list java modules? `java --list-modules`
 * How to describe java modules? `java --describe-module java.base`

## Before adding module-info

```shell
cd mo-child-api
mvn clean package
java -cp target/mo-child-api-1.0-SNAPSHOT.jar com.test.mo_child_api.App
```

```shell
jar tf mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar
jar tf mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar

java -cp mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar com.test.mo_child_api.App
java -cp mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar com.test.mo_child_cli.App
```

After adding module-info to `mo-child-api`
```shell
 java --module-path mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar -m mod_api/com.test.mo_child_api.App
 java -cp mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar:mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar com.test.mo_child_cli.App 
```

After adding module-info to `mo-child-cli`
```shell
java --module-path mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar:mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar -m mod_api/com.test.mo_child_api.App

java --module-path mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar:mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar -m mod_cli/com.test.mo_child_cli.App
```

### Jdeps
```shell

jdeps mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar
 
```

### Jlink
```shell

jlink --module-path mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar:mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar --add-modules mod_cli --output meme

```

```shell
# Go into the meme/bin 

./java --module mod_api/com.test.mo_child_api.App
```

### Creating custom runtime
```shell
jlink --launcher customjrelauncher=mod_cli/com.test.mo_child_cli.App --module-path mo-child-cli/target/mo-child-cli-1.0-SNAPSHOT.jar:mo-child-api/target/mo-child-api-1.0-SNAPSHOT.jar --add-modules mod_cli --output meme-2

./meme-2/bin/customjrelauncher 
```
