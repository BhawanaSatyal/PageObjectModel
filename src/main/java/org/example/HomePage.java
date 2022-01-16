package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    By registerlink = By.xpath("//a[@class='ico-register']");
    By _computers = By.xpath("//ul[@class='top-menu notmobile']/Li/a[@href='/computers']");


    public void clickOnRegister(){
    clickOnElement(registerlink);

}

    public void clickOnComputers()
    {
        clickOnElement(_computers);
    }

    }





