package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.example.Constants.*;

public class LoginTest {
    public LoginTest() {}
    public static WebDriver driver;

    @Before
    public void set() {
        System.setProperty("webdriver.chrome.driver", "C:\\Games\\IdeaProjects\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(URL);
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputLogin(LOGIN);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickLoginButton();

        MainPage mainPage = new MainPage(driver);
        Assert.assertEquals(USERNAME, mainPage.getUserName());
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
