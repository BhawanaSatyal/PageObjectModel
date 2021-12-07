package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage extends Utils {

        By _firstNamefield = By.id("FirstName");
        By _lastNamefiled = By.id("LastName");
        By _emailField = By.id("Email");
        By _passwordField = By.id("Password");
        By _confirmPasswordField = By.id("ConfirmPassword");
        By _clickOnRegisterButton = By.id("register-button");


    public void verifyUserIsOnRegisterPage() {

            Assert.assertTrue(driver.getCurrentUrl().contains("register"));

        }


      public void userEntersRegistrationDetails(){

            typeText(_firstNamefield, "Bhawana");// add value
            typeText(_lastNamefiled, "Satyal");// type last name
            Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));// select Day from dropdown
            Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));//select month from dropdown
            selectMonth.selectByValue("4");
            Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));//select year from dropdown
            selectYear.selectByVisibleText("2000");
            String email = "bhawana+" + currentTimeStamp() + "@gmail.com";
            typeText(_emailField, email);
            typeText(_passwordField, "123456");// type password
            typeText(_confirmPasswordField, "123456");// confirm password

        }
        public void clickOnRegister1() {
            waitForClickable(By.name("register-button"), 10);// applied wait time
            clickOnElement(_clickOnRegisterButton);


            }

    }



