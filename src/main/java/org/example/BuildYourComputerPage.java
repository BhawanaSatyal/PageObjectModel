package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class BuildYourComputerPage extends Utils {

        By _emailAFriendButton = By.xpath("//div[@class='email-a-friend']/button");
    public void checkUserIsOnTheBuildYourComputerPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("build-your-own-computer"));
    }

    public void clickOnEmailAFriendButton(){
        clickOnElement(_emailAFriendButton);
    } // click on email a friend


}
