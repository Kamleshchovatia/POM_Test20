package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager extends Utils{

    String browserName = "Chrome";

    public void openBrowser(){

        if (browserName.equalsIgnoreCase("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();// Chrome browser

        } else if(browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver(); // firefox browser
        }else if (browserName.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver(); // Edge browser
        } else
        {
            System.out.println("Either your browser name is wrong or not provided"+ browserName);
        }


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser()
    {
       driver.quit();
    }

}
