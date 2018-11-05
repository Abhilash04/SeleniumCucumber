package com.selenium.pages;

import com.selenium.base.TestBase;
import com.selenium.util.ReusableFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class MainPage extends TestBase {

    private static Logger logger = Logger.getLogger(MainPage.class.getName());

    // Web Elements Main Page

    private static final By user_message_input = By.xpath("//input[@id='user-message']");
    private static final By show_message_button = By.xpath("//button[text()='Show Message']");
    private static final By show_message_text = By.xpath("//div[@id='user-message']//following::span[@id='display']");
    private static final By enter_first_value = By.xpath("//input[@id='sum1']");
    private static final By enter_second_value = By.xpath("//input[@id='sum2']");
    private static final By get_total_button = By.xpath("//button[text()='Get Total']");
    private static final By show_total_text = By.xpath("//span[@id='displayvalue']");

    public static boolean verifyMainScreenElements(WebDriver driver) {
        boolean flag = true;
        try{
            logger.info("Verifying Main Page Elements.");
            ArrayList<By> locators = new ArrayList<By>();

            locators.add(user_message_input);
            locators.add(show_message_button);
            locators.add(enter_first_value);
            locators.add(enter_second_value);
            locators.add(get_total_button);

            if (ReusableFunctions.verifyElementsLocated(locators)){
                logger.info("All Main Page Elements Displayed.");
            }else {
                flag = false;
                logger.error("Main Page Elements Not Displayed.");
            }

        }catch(Exception Ex){
            flag = false;
            logger.error("Exception Occurred While Verifying Main Page Elements: "+Ex.getMessage());
        }
        return flag;
    }

    public static boolean verifyValidUserInput(WebDriver driver, String userInput){
        boolean flag = false;

        try {
            logger.info("Verifying Valid User Input.");

            ReusableFunctions.enterText(user_message_input, userInput);
            ReusableFunctions.click(show_message_button);
            String message = ReusableFunctions.getTextByInnerText(show_message_text);

            if (ReusableFunctions.verifyTextMatch(message, userInput)){
                flag = true;
            }

        }catch(Exception Ex){
            logger.error("Exception Occurred While Verifying Valid User Input: "+Ex.getMessage());
        }
        return flag;
    }

    public static boolean verifyAdditionFunctionality(WebDriver driver, String numA, String numB, String expected){
        boolean flag = false;

        try {
            logger.info("Verifying Addition Functionality.");

            ReusableFunctions.enterText(enter_first_value, numA);
            ReusableFunctions.enterText(enter_second_value, numB);
            ReusableFunctions.click(get_total_button);
            String addition = ReusableFunctions.getTextByInnerText(show_total_text);

            if (ReusableFunctions.verifyTextMatch(addition, expected)){
                flag = true;
            }

        }catch(Exception Ex){
            logger.error("Exception Occurred While Verifying Addition Functionality: "+Ex.getMessage());
        }
        return flag;
    }

}
