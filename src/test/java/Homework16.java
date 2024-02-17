import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {

    @Test(groups = "Smoke")
    public void registrationNavigationTest() {
        WebElement registrationLink = getDriver().findElement(By.cssSelector("[href='registration']"));
        registrationLink.click();
        WebElement registrationText = getDriver().findElement(By.xpath("//h2[contains(text(), 'Register new account or')]"));
        Assert.assertTrue(registrationText.isDisplayed());
        closeBrowser();
    }
}