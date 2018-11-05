package com.selenium.util;

import org.apache.commons.io.FileUtils;
import com.selenium.base.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReusableFunctions extends TestBase {

    private static Logger logger = Logger.getLogger(ReusableFunctions.class.getName());

    private static int timeout;

    private static int timeoutValue(){
        try{
           timeout = Integer.parseInt(prop.getProperty("timeout"));
        }catch (Exception Ex) {
            logger.error("Exception Occurred While Getting Timeout Property.");
        }
        return timeout;
    }

    public static boolean waitForElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, timeoutValue());
        boolean flag = true;
        try{
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }catch(Exception Ex) {
            flag = false;
            logger.error("Exception Occurred While Locating The Element: " + Ex.getMessage());
        }
        return flag;
    }

    public static boolean waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeoutValue());
        boolean flag = true;
        try{
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
        }catch(Exception Ex) {
            flag = false;
            logger.error("Exception Occurred While Locating The Element: " + Ex.getMessage());
        }
        return flag;
    }

    public static boolean waitForElementPresent(By locator){
        WebDriverWait wait = new WebDriverWait(driver, timeoutValue());
        boolean flag = true;
        try{
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.presenceOfElementLocated(locator));
        }catch(Exception Ex) {
            flag = false;
            logger.error("Exception Occurred While Locating The Element: " + Ex.getMessage());
        }
        return flag;
    }

    public static boolean verifyElementsLocated(ArrayList<By> arrayList){
        boolean flag = true;
        try{
            for (By locator : arrayList){
                if (waitForElementVisible(locator)){
                    logger.info(driver.findElement(locator).toString()+": element is displayed.");
                }else{
                    logger.error(driver.findElement(locator).toString()+": element isn't displayed.");
                    flag=false;
                }
            }
        }catch (Exception Ex){
            flag=false;
            logger.error("Exception Occurred While Locating The Elements: " + Ex.getMessage());
        }
        return flag;
    }

    public static boolean isElementChecked(By locator){
        boolean flag = true;
        try{
            if (waitForElementPresent(locator)){
                if (!driver.findElement(locator).isSelected()){
                    flag = false;
                }
                logger.info(driver.findElement(locator).toString()+": element is selected.");
            }
        }catch (Exception Ex){
            flag = false;
            logger.error("Exception Occurred While Checking the Element Selected: " + Ex.getMessage());
        }
        return flag;
    }


    public static boolean waitForElementClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, timeoutValue());
        boolean flag = true;
        try{
            wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        }catch(Exception Ex) {
            flag = false;
            logger.error("Exception Occurred While Locating The Element: " + Ex.getMessage());
        }
        return flag;
    }

    public static void enterText(By locator, String value){
        try{
            if (waitForElementVisible(locator)) {
                WebElement element = driver.findElement(locator);
                element.clear();
                element.sendKeys(value);
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Entering The Text: " + Ex.getMessage());
        }

    }

    public static void pressEnterKey(By locator){
        try{
            if (waitForElementVisible(locator)) {
                Thread.sleep(500);
                WebElement element = driver.findElement(locator);
                element.sendKeys(Keys.ENTER);
                Thread.sleep(500);
            }
        }catch (Exception Ex) {
            logger.error("Exception Occurred While Sending Enter Key" + Ex.getMessage());
        }
    }

    public static void dropdownSelect(By locator, String value){
        try{
            if (waitForElementVisible(locator)) {
                WebElement element = driver.findElement(locator);
                Select select = new Select(element);
                select.selectByVisibleText(value);
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Selecting an Option: " + Ex.getMessage());
        }
    }

    public static void click(By locator){
        try{
            if (waitForElementClickable(locator)){
                WebElement element = driver.findElement(locator);
                element.click();
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Clicking The Element: " + Ex.getMessage());
        }
    }

    public static void moveToElementAndClick(By locator){
        try{
            if (waitForElementClickable(locator)){
                WebElement element = driver.findElement(locator);
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().build().perform();
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Clicking The Element: " + Ex.getMessage());
        }

    }

    public static String getTextByAttributeValue(By locator){
        String text = null;
        try{
            if (waitForElementPresent(locator)) {
                WebElement element = driver.findElement(locator);
                text = element.getAttribute("value");
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Getting The Text: " + Ex.getMessage());
        }
        return text;
    }

    public static String getTextByInnerText(By locator){
        String text = null;
        try{
            if (waitForElementPresent(locator)) {
                WebElement element = driver.findElement(locator);
                text = element.getText();
            }
        }catch(Exception Ex) {
            logger.error("Exception Occurred While Getting The Text: " + Ex.getMessage());
        }
        return text;
    }

    public static String takeScreenShot(String screenshotName) {
        String destination = null;
        try{
            String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".png";
            File finalDestination = new File(destination);
            FileUtils.copyFile(source, finalDestination);

            destination = finalDestination.getAbsolutePath();
            logger.info("Saving screenshot to failed repo: " + destination);

        }catch (Exception Ex){
            logger.error("Exception Occurred While Getting The Text: " + Ex.getMessage());
        }
        return destination;
    }


    public static boolean verifyTextMatch(String actualText, String expectedText){
        boolean flag = false;
        try {
            logger.info("Actual Text From Application Web UI --> :: " + actualText);
            logger.info("Expected Text From Application Web UI --> :: " + expectedText);

            if(actualText.equals(expectedText)){
                logger.info("### VERIFICATION TEXT MATCHED !!!");
                flag = true;
            }else{
                logger.error("### VERIFICATION TEXT DOES NOT MATCHED !!!");
            }

        }catch (Exception Ex){
            logger.error("Exception Occurred While Verifying The Text Match: " + Ex.getMessage());
        }
        return flag;
    }
}

