package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends BasePage {

    LoadProp loadProp = new LoadProp();
//    public String browserName = "edge";
    public String browserName = System.getProperty("browser");

    public  void openBrowser(){
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");//System Property for Chrome Driver
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");//System Property for Edge
            driver = new EdgeDriver();

        }else{
            System.out.println("Incorrect Browser");
        }

        driver.manage().window().maximize();// open window fullscreen
        driver.get(loadProp.getProperty("url"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//Applied wait time
       // driver.get("https://demo.nopcommerce.com/");// launch website



    }

    public void closeBrowser() {
        driver.close();
    }
}
