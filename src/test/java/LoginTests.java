import org.example.HomePage;
import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    LoginPage loginPage=null;
    @Test(enabled = false, description = "Check if user login with correct credentials", priority = 1, groups = "Smoke")
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("demo@class.com", "te$t$tudent");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getAvatar().isDisplayed()); // true
    }

    @Test
    public void loginWithEmptyCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("demo@class.com", "");
        Assert.assertTrue(loginPage.getLogo().isDisplayed());

    }
}
