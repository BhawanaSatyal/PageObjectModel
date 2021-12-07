package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductEmailAFriendPage extends Utils{


    By _friendEmailTextBox = By.id("FriendEmail");
    By _personalMessageTextBox = By.id("PersonalMessage");
    By _submitButton = By.xpath("//button[@type='submit' and @name]");

    public void fillForm(){
        typeText(_friendEmailTextBox, "xyz@hotmail.com");// type friendemail
        typeText(_personalMessageTextBox, "Amazing Product Highly Recommended");// type a personal message
        clickOnElement(_submitButton);// click submit
    }

    public void checkFormIsSubmitted(){
        String actual = getTextFromElement(By.xpath("//div[@class='result']"));
        String expected = "Your message has been sent";
        Assert.assertEquals(actual, expected, "Error");// compares two conditions
    }
}
