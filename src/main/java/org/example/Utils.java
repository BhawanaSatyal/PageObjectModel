package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;


public class Utils extends BrowserManager {

    public static void clickOnElement(By by) { //declared ClickOnElement Method
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {   //declared typeText Method
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) { //declared getTextFromElement Method
        String s1 = driver.findElement(by).getText();
        System.out.println(s1);
        return s1;
    }

    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);

    }

    public static void waitForClickable(By by, int timeInSeconds) {

        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);// time applied
        wait.until(ExpectedConditions.elementToBeClickable(by));

    }
    public static void captureScreenShot(String fileName){
        //convert web driver object to TakeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot) driver);

        //Call getScreenshotsAs method to create image file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File destFile = new File("src/test/ScreenShot/"+fileName + currentTimeStamp() + ".png");

        //Copy file at destination
        try{
            FileUtils.copyFile(srcFile,destFile);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

}
