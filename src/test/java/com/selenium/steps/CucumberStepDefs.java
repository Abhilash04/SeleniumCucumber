package com.selenium.steps;

import com.selenium.base.TestBase;
import com.selenium.pages.MainPage;
import com.selenium.util.ReusableFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class CucumberStepDefs extends TestBase {

    private static Logger logger = Logger.getLogger(CucumberStepDefs.class.getName());
    public static MainPage _mainPage;
    public static SoftAssert _softAssert;
    public static ReusableFunctions _reusableFunc;
    private Scenario _scenario;

    @Before
    public void initializeScenario(Scenario scenarioInstance){
        this._scenario = scenarioInstance;
    }

    @Before
    public void getDriver() throws IOException {
        _mainPage = new MainPage();
        _softAssert = new SoftAssert();
        _reusableFunc = new ReusableFunctions();
    }

    @Given("^Launch the demo site$")
    public void launch_the_demo_site() throws Throwable {
        initialization();
    }

    @Then("^Verify all main screen elements$")
    public void verify_all_main_screen_elements() throws Throwable {
        if (!_mainPage.verifyMainScreenElements(driver)) {
            _softAssert.fail("Element not present on the page");
        }
        _softAssert.assertAll();
    }

    @Given("^Verify Valid User Input \"([^\"]*)\"$")
    public void verify_Valid_User_Input(String arg1) throws Throwable {
        if (!_mainPage.verifyValidUserInput(driver, arg1)) {
            _softAssert.fail("Not a valid user input: " + arg1);
        }
        _softAssert.assertAll();
    }
    @Given("^Verify Valid Addition with numA \"([^\"]*)\" numB \"([^\"]*)\" and expected result \"([^\"]*)\"$")
    public void verify_Valid_Addition_with_numA_numB_and_expected_result(String arg1, String arg2, String arg3) throws Throwable {
        if (!_mainPage.verifyAdditionFunctionality(driver, arg1, arg2, arg3)) {
            _softAssert.fail("Not a valid addition: " + arg3);
        }
        _softAssert.assertAll();
    }

    @After
    public void close_All_Browser_Instances() throws Throwable {
        if (_scenario.isFailed()) {
            _scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
            _scenario.write("Scenario Failed !!");
        } else {
            _scenario.write("Scenario passed !!");
        }

        if(driver!=null){
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }
}
