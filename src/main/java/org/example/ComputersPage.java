package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputersPage extends Utils{

    By _desktopsImage = By.xpath("//img[@alt='Picture for category Desktops']");

    public void clickOnDesktopsImage(){
        clickOnElement(_desktopsImage);
    }

    public void checkUserIsOnComputersPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("computers"));// compares two conditions
    }
}
