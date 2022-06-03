package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ProcessedSuccessfully extends Utils{

    public void userVerifyOrderHasBeenSuccessfullyProcessed()
    {
    // verify order successfully processed

        String expectedMessage="Your order has been successfully processed!";
        String actualMessage=driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]")).getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Your order has NOT been successfully processed");
    }
}
