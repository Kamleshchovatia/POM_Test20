package org.example;

import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utils{

    private By _clickOnCheckOutAsGuessButton=By.xpath("//button[contains(text(),'Checkout as Guest')]");

    public void clickOnCheckOutAsGuestButton()
    {
        driver.findElement(_clickOnCheckOutAsGuessButton).click();
    }
}
