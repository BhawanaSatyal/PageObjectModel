package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationSuccess extends Utils {


    public void verifyUserShouldBeRegisteredSuccessfully() {

        String expectedRegistrationSuccessMessage = "Your registration completed"; // expected result
        String actualRegistrationSuccessMessage = getTextFromElement(By.xpath("//div[@class='result']"));// actual result
        Assert.assertEquals(expectedRegistrationSuccessMessage, actualRegistrationSuccessMessage);
    }
}
