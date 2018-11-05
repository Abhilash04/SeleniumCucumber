# SeleniumCucumber
Selenium Framework Development Using Cucumber

#### Initial Setup: 
- Install and configure [JDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 
- Install and configure [Maven](https://maven.apache.org/download.cgi)
- Setup your IDE (Preferably [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows))
- Import project files
- Simply run ``` mvn clean install``` command to run test cases

#### Major Files:
- **config.properties:** file to change global configuration like browser, appUrl and timeout settings 
    ``` SeleniumCucumber\src\main\java\com\selenium\config\config.properties ```

- **DemoAppTest.feature:** feature file containing different sanity and regression scenarios 
    ```SeleniumCucumber\src\test\resource\features\DemoAppTest.feature```

- **CucumberStepDefs.java:** steps definition for feature file 
    ```SeleniumCucumber\src\test\java\com\selenium\steps\CucumberStepDefs.java```

- **TestRunner.java:** test runner class to execute the step definitions, this file can be changed for different tags to run like - @sanity, @regression 
    ```SeleniumCucumber\src\test\java\com\selenium\tests\TestRunner.java```

- **Cucumber Html Execution Report**
    ```SeleniumCucumber\target\cucumber-reports\advanced-reports\cucumber-html-reports\report-feature_DemoAppTest-feature.html```

- **Logs - Html and Text**
    ```SeleniumCucumber\Logs\Html``` and ```SeleniumCucumber\Logs\Text```
