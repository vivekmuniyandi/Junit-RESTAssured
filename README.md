# Junit+RESTAssured
A sample project which you can just download and get started with Junit and RESTAssured tests

## How to Setup?
Download the project or do a clone of the project. You will have Junit and RESTAssured dependencies already included in the gradle file and you can simply start writing your Junit and RESTAssured tests right away. You can just go to src/test/java and add your Junit and RESTAssured test files in there.


## How to run the tests?
The current tests present in the src/test/java directory require a sample REST end point returning a json node. So let us start the server by executing

```
./gradlew -PmainClass=com.example.sample.SampleRESTEndPoint execute
```

from the root directory of the project. To run the tests, execute

``` 
./gradlew test
```

This should trigger the job which would take care of compiling the files and running all the tests under src/test/java folder. If you want to run a single test(for example : SampleProgramJunitTest), you can run it using the following command:

```
./gradlew -Dtest.single=SampleProgramJunitTest test
```

If the Operating system is Windows, use the gradlew.bat file.
