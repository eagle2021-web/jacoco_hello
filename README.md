# jacoco_hello
PS E:\projects\java\jacoco_hello> mvn --version
Apache Maven 3.9.2 (c9616018c7a021c1c39be70fb2843d6f5f9b8a1c)
Maven home: E:\sdk\apache-maven-3.9.2
Java version: 1.8.0_371, vendor: Oracle Corporation, runtime: E:\sdk\jdk\jre
Default locale: zh_CN, platform encoding: GBK
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

java -jar lib/jacococli.jar report report/target/jacoco.exec --classfiles report/target/classes/org/example/Main.class --csv report.csv

java -jar lib/jacococli.jar report report/target/jacoco.exec --classfiles report/target/classes --html report.html --name MyProject

```xml
<!--没有依赖-->
    <dependency>
        <groupId>org.jacoco</groupId>
        <artifactId>org.jacoco.cli</artifactId>
        <version>0.8.7</version>
        <classifier>nodeps</classifier>
    </dependency>
```