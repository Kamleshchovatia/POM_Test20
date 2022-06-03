package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ShippingDetails extends Utils{

    private By _enterFirstName=By.xpath("//input[@id='BillingNewAddress_FirstName']");

    private By _enterLastName=By.xpath("//input[@id='BillingNewAddress_LastName']");

    private By _emailAddress=By.xpath("//input[@id='BillingNewAddress_Email']");

    private By _selectCountry=By.xpath("//select[@id='BillingNewAddress_CountryId']");

    private By _enterCity=By.xpath("//input[@id='BillingNewAddress_City']");

    private By _enterAddress1=By.xpath("//input[@id='BillingNewAddress_Address1']");

    private By _enterPostalCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    private By _enterPhoneNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    private By _clickOnContinueButton=By.xpath("//button[@onclick=\"Billing.save()\"]");

    private By _clickOnCheckOutButton=By.xpath("//button[@onclick=\"ShippingMethod.save()\"]");

    private By _clickOnCheckOutContinue1=By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]");

    private By _clickOnCheckOutContinue2=By.xpath("//button[@onclick=\"PaymentInfo.save()\"]");

    private By _clickOnConfirmButton=By.xpath("//button[contains(text(),'Confirm')]");

    public void enterFirstName()
    {
        driver.findElement(_enterFirstName).sendKeys("asdfcgr");
    }
    public void enterLastName()
    {
    driver.findElement(_enterLastName).sendKeys("ghjtyuio");
    }
    public void emailAddress()
    {
     driver.findElement(_emailAddress).sendKeys("asdfgh"+randomDate()+"@mail.com");
    }
    public void selectCountry()
    {
        //driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"))
        Select countyID = new Select(driver.findElement(_selectCountry));
        countyID.selectByVisibleText("United Kingdom");
    }
    public void enterCity()
    {
        driver.findElement(_enterCity).sendKeys("London");
    }
    public void enterAddress1()
    {
        driver.findElement(_enterAddress1).sendKeys("Buckingham Palace");
    }
    public void enterPostalCode()
    {
        driver.findElement(_enterPostalCode).sendKeys("SW1A 1AA");
    }
    public void enterPhoneNumber()
    {
        driver.findElement(_enterPhoneNumber).sendKeys("03031237300");
    }
    public void clickOnContinueButton()
    {
        driver.findElement(_clickOnContinueButton).click();
    }
    public void clickOnCheckOutContinue()
    {
        driver.findElement(_clickOnCheckOutButton).click();
    }
    public void clickOnCheckOutContinue1()
    {
        driver.findElement(_clickOnCheckOutContinue1).click();
    }
    public void clickOnCheckOutContinue2()
    {
        driver.findElement(_clickOnCheckOutContinue2).click();
    }
    public void clickOnConfirmButton()
    {
        driver.findElement(_clickOnConfirmButton).click();
    }

}
