package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class MainPage {
    private static WebDriver driver_;
    public MainPage(WebDriver driver) {
        this.driver_ = driver;
    }

    static By userNameLocator = By.xpath("//*[@class=\"tico ellip\"]");

    public static String getUserName() {
        driver_.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement userName = driver_.findElement(userNameLocator);
        return userName.getText();
    }
}
