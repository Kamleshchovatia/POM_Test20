package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    private By _clickOnLogIn=By.xpath("//a[contains(text(),'Log in')]");

    private By _clickOnComputers=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]");

    public void clickOnLogIn()
    {
        driver.findElement(_clickOnLogIn).click();
    }

    public void clickOnComputers()
    {
        driver.findElement(_clickOnComputers).click();
    }



}
