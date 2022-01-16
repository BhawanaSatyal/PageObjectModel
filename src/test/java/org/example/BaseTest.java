package org.example;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

    BrowserManager browserManager = new BrowserManager();
    @BeforeMethod
    public void runBrowser()
    {
        browserManager.openBrowser();
    }// open browser


    @AfterMethod
    public void closeBrowser(ITestResult result) {
         //closing the browser
            if (!result.isSuccess()) {
                captureScreenShot(result.getName());
            }

             browserManager.closeBrowser();
        }
    }




