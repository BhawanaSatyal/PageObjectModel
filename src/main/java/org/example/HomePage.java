package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By _registerlink = By.xpath("//a[@class='ico-register']");
    By _computers = By.xpath("//ul[@class='top-menu notmobile']/Li/a[@href='/computers']");



    public void clickOnRegister(){
    clickOnElement(_registerlink);

}

    public void clickOnComputers()
    {
        clickOnElement(_computers);
    }

    }





