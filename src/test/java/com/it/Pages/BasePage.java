package com.it.Pages;

import com.it.Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected WebDriver driver = DriverFactory.getDriver();



    public BasePage() {

        PageFactory.initElements(driver, this);


    }
}
