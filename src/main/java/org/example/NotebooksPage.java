package org.example;

import org.openqa.selenium.By;

public class NotebooksPage extends Utils{

    private By _clickOnAppleMacBookPro=By.xpath("//h2/a[@href='/apple-macbook-pro-13-inch']");

    public void clickOnAppleMacBookPro()
    {
        driver.findElement(_clickOnAppleMacBookPro).click();
    }
}
