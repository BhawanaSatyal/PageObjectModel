package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Desktops extends Utils {

    By _buildYourComputerImage = By.xpath("//div/div/h2/a[@href='/build-your-own-computer']");
    public void checkUserIsOnDesktopsPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"), "Error: Incorrect URL");
    }

    public void clickOnBuildYourComputerImage(){
        clickOnElement(_buildYourComputerImage);
    }
}
