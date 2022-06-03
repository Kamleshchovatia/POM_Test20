package org.example;

import org.openqa.selenium.By;

public class CartPage extends Utils{

    private By _radioButtonTC=By.xpath("//input[@id='termsofservice']");

    private By _clickOnCheckOutButton=By.xpath("//button[@id='checkout']");

    public void radioButtonTC(){

        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
    }

    public void clickOnCheckOutButton()
    {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }

}
