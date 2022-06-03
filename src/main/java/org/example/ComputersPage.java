package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Utils{

    private By _clickOnNoteBooks=By.xpath("//ul[@class=\"sublist\"]/li[2]/a[@href=\"/notebooks\"]");

    public void clickOnNoteBooks()
    {
        driver.findElement(_clickOnNoteBooks).click();
    }
}
