package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{

    private By _enterEmailAddress=By.xpath("//input[@class=\"email\"]");

    private By _enterPassword=By.xpath("//input[@class=\"password\"]");

    private By _clickOnLogInButton=By.xpath("//button[contains(text(),'Log in')]");

    public void enterEmailAddress()
    {
    driver.findElement(_enterEmailAddress).sendKeys("abc123456"+randomDate()+"@gmail.com");
    }

    public void enterPassword()
    {
        driver.findElement(_enterPassword).sendKeys("dfghjkl");
    }

    public void clickOnLoginButton()
    {
        driver.findElement(_clickOnLogInButton).click();
    }

}
