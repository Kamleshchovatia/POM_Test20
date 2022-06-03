package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPro extends Utils{

    private By _clickOnAddToCartButton=By.xpath("//button[@id='add-to-cart-button-4']");

    private By _clickOnShoppingCart=By.xpath("//a[contains(text(),'shopping cart')]");

    public void clickOnAddToCartButton()
    {
      driver.findElement(_clickOnAddToCartButton).click();
    }

    public void clickOnShoppingCart()

    {
        driver.findElement(_clickOnShoppingCart).click();
    }
}
