import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest{
    LoginPage loginPage = null;
    @Test
    public void playSong() {
        loginPage = new LoginPage(driver);
        loginPage.login("dmytro.kravchuk@testpro.io", "Fr440003");
//        WebElement playSongButton = driver.findElement(By.cssSelector("[data-testid='play-btn']"));
//     playSongButton.click();
//WebElement nextSongButton = driver.findElement(By.cssSelector("[data-testid='play-next-btn']"));
//nextSongButton.click();
        WebElement allSongs = driver.findElement(By.cssSelector("[href='#!/songs']"));
        allSongs.click();
        WebElement  shuffleButton = driver.findElement(By.cssSelector("[data-test='btn-shuffle-all']"));
        shuffleButton.click();
WebElement soundBar = driver.findElement(By.cssSelector("[data-test='soundbars']"));
        Assert.assertTrue(soundBar.isDisplayed());
    }
}
