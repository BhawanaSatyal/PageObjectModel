package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
   By registerlink = By.xpath("//a[@class=\"ico-register\"]");
 //   By registerlink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By _computers = By.xpath("//ul[@class='top-menu notmobile']/Li/a[@href='/computers']");


    public void clickOnRegister(){
    clickOnElement(registerlink);

}

    public void clickOnComputers()
    {
        clickOnElement(_computers);
    }

    }





