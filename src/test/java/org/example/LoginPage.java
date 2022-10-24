package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    By loginFieldLocator = By.xpath("//*[@id=\"field_email\"]");
    By passwordFieldLocator = By.xpath("//*[@id=\"field_password\"]");
    By loginButtonLocator = By.xpath("//*[@value=\"Войти в Одноклассники\"]");

    public void inputLogin(String login) {
        driver.findElement(loginFieldLocator).sendKeys(login);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordFieldLocator).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }
}
