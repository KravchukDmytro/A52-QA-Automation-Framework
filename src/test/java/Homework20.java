import org.example.HomePage;
import org.example.LoginPage;
import org.example.PlayListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.WaitUtils.waitUntilVisibilityOfElementLocatedBy;


public class Homework20 extends BaseTest{
    LoginPage loginPage = null;
    HomePage homePage = null;
    @Test
    public void deletePlaylist() {
        String playListName = "TestPlayListForDeleting";
        loginPage = new LoginPage(driver);
        loginPage.login("dmytro.kravchuk@testpro.io", "Fr440003");
        homePage=new HomePage(driver);
        homePage.createPlayList(actions, wait, playListName);
        homePage.openPlayList(playListName);
        PlayListPage playListPage = new PlayListPage(driver);
        playListPage.deletePlayList(wait);
        waitUntilVisibilityOfElementLocatedBy(driver, By.xpath("//section[@id='playlists']//li/a[text()='TestPlayListForDeleting']"));
        Assert.assertTrue(homePage.getPlayListByName(playListName).isDisplayed());


    }
}
