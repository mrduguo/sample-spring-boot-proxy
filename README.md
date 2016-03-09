=== Sample spring boot project
* spring boot
* spring rest
* spring cloud zuul
* gradle multiple projects with wrapper


=== Commands

#### build the application
```
./gradlew
```

#### run calculator server
```
java -jar calculator-server/build/libs/calculator-server.jar
```

#### run gateway server
```
java -jar gateway-server/build/libs/gateway-server.jar
```

#### access the service directly
http://localhost:8801/cal/v1/add?a=1&b=2

#### access the service via proxy controller
http://localhost:8802/cal/add?a=1&b=2


#### access the service via zuul filter
http://localhost:8802/proxy/cal/add?a=1&b=2