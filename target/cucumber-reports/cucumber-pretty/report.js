$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DemoAppTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: abhilash.sharma@sonetel.com"
    }
  ],
  "line": 2,
  "name": "Demo Web App Login",
  "description": "This feature deals with the login functionality and basic element checks",
  "id": "demo-web-app-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 51572057,
  "status": "passed"
});
formatter.before({
  "duration": 39846,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify Main Screen Elements",
  "description": "",
  "id": "demo-web-app-login;verify-main-screen-elements",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Verify all main screen elements",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberStepDefs.launch_the_demo_site()"
});
formatter.result({
  "duration": 5289910735,
  "status": "passed"
});
formatter.match({
  "location": "CucumberStepDefs.verify_all_main_screen_elements()"
});
formatter.result({
  "duration": 221257892,
  "status": "passed"
});
formatter.write("Scenario passed !!");
formatter.after({
  "duration": 118285504,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Verify Valid User Input",
  "description": "",
  "id": "demo-web-app-login;verify-valid-user-input",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Verify Valid User Input \"\u003cText_Message\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "demo-web-app-login;verify-valid-user-input;",
  "rows": [
    {
      "cells": [
        "Text_Message"
      ],
      "line": 16,
      "id": "demo-web-app-login;verify-valid-user-input;;1"
    },
    {
      "cells": [
        "Welcome Selenium Learner"
      ],
      "line": 17,
      "id": "demo-web-app-login;verify-valid-user-input;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14521842,
  "status": "passed"
});
formatter.before({
  "duration": 156915,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify Valid User Input",
  "description": "",
  "id": "demo-web-app-login;verify-valid-user-input;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Verify Valid User Input \"Welcome Selenium Learner\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CucumberStepDefs.launch_the_demo_site()"
});
formatter.result({
  "duration": 4644368436,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome Selenium Learner",
      "offset": 25
    }
  ],
  "location": "CucumberStepDefs.verify_Valid_User_Input(String)"
});
formatter.result({
  "duration": 384500350,
  "status": "passed"
});
formatter.write("Scenario passed !!");
formatter.after({
  "duration": 118356028,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "Verify Valid Addition",
  "description": "",
  "id": "demo-web-app-login;verify-valid-addition",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Verify Valid Addition with numA \"\u003cNumber_A\u003e\" numB \"\u003cNumber_B\u003e\" and expected result \"\u003cExpected\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "demo-web-app-login;verify-valid-addition;",
  "rows": [
    {
      "cells": [
        "Number_A",
        "Number_B",
        "Expected"
      ],
      "line": 27,
      "id": "demo-web-app-login;verify-valid-addition;;1"
    },
    {
      "cells": [
        "5",
        "10",
        "15"
      ],
      "line": 28,
      "id": "demo-web-app-login;verify-valid-addition;;2"
    },
    {
      "cells": [
        "4",
        "7",
        "12"
      ],
      "line": 29,
      "id": "demo-web-app-login;verify-valid-addition;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17731718,
  "status": "passed"
});
formatter.before({
  "duration": 40551,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify Valid Addition",
  "description": "",
  "id": "demo-web-app-login;verify-valid-addition;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Verify Valid Addition with numA \"5\" numB \"10\" and expected result \"15\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CucumberStepDefs.launch_the_demo_site()"
});
formatter.result({
  "duration": 4427358525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 33
    },
    {
      "val": "10",
      "offset": 42
    },
    {
      "val": "15",
      "offset": 67
    }
  ],
  "location": "CucumberStepDefs.verify_Valid_Addition_with_numA_numB_and_expected_result(String,String,String)"
});
formatter.result({
  "duration": 372723634,
  "status": "passed"
});
formatter.write("Scenario passed !!");
formatter.after({
  "duration": 105406154,
  "status": "passed"
});
formatter.before({
  "duration": 25131394,
  "status": "passed"
});
formatter.before({
  "duration": 1046921,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify Valid Addition",
  "description": "",
  "id": "demo-web-app-login;verify-valid-addition;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 20,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Launch the demo site",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Verify Valid Addition with numA \"4\" numB \"7\" and expected result \"12\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CucumberStepDefs.launch_the_demo_site()"
});
formatter.result({
  "duration": 4484612307,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 33
    },
    {
      "val": "7",
      "offset": 42
    },
    {
      "val": "12",
      "offset": 66
    }
  ],
  "location": "CucumberStepDefs.verify_Valid_Addition_with_numA_numB_and_expected_result(String,String,String)"
});
formatter.result({
  "duration": 461312406,
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tNot a valid addition: 12\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:43)\r\n\tat com.selenium.steps.CucumberStepDefs.verify_Valid_Addition_with_numA_numB_and_expected_result(CucumberStepDefs.java:63)\r\n\tat ✽.And Verify Valid Addition with numA \"4\" numB \"7\" and expected result \"12\"(DemoAppTest.feature:23)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.write("Scenario Failed !!");
formatter.after({
  "duration": 400791274,
  "status": "passed"
});
});