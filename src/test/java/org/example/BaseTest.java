package org.example;

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
    public void closeBrowser() {
        browserManager.closeBrowser();//closing the browser
    }
}

