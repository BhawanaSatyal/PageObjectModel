package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {

    HomePage homepage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccess registrationSuccess = new RegistrationSuccess();

    ComputersPage computersPage = new ComputersPage();
    Desktops desktops = new Desktops();

    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();



    @Test
    public void verifyUserShouldBeRegisteredSuccessfully() {

        homepage.clickOnRegister(); // click on register
        registrationPage.userEntersRegistrationDetails();// enter user details
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.clickOnRegister1();
        registrationSuccess.verifyUserShouldBeRegisteredSuccessfully();

    }

    @Test
    public void userIsAbleToNavigateToTheDesktopPage(){
        homepage.clickOnComputers();  // click on computers
        computersPage.checkUserIsOnComputersPage();// observe
        computersPage.clickOnDesktopsImage();// click on desktop image
        desktops.checkUserIsOnDesktopsPage();// observe

    }

    @Test
    public void userShouldBeAbleToReferAProductToAFriend(){
        verifyUserShouldBeRegisteredSuccessfully();
        userIsAbleToNavigateToTheDesktopPage();
        desktops.clickOnBuildYourComputerImage();// click on build you computer
        buildYourComputerPage.checkUserIsOnTheBuildYourComputerPage();// observe
        buildYourComputerPage.clickOnEmailAFriendButton();// click on email a friend
        productEmailAFriendPage.fillForm();// type a message

    }


}