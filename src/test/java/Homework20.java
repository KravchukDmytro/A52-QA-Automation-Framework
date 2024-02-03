import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework20 extends BaseTest{
    @Test
    public void deletePlaylist() {
        String playListName = "TestPlayListForDeleting";
        login("dmytro.kravchuk@testpro.io", "Fr440003");
        WebElement addPlayListButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#playlists i[role='button']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i[data-testid='sidebar-create-playlist-btn']")));
        addPlayListButton.click();
        WebElement createPlayListButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='playlist-context-menu-create-simple']")));
        createPlayListButton.click();
        WebElement playListNameInput = driver.findElement(By.cssSelector("[name='create-simple-playlist-form']>input"));
        playListNameInput.sendKeys(playListName);
        playListNameInput.sendKeys(Keys.ENTER);

        WebElement playList =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='playlists']//li/a[text()='TestPlayListForDeleting']")));
        playList.click();
        WebElement deleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'btn-delete-playlist')]")));
        deleteButton.click();
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//section[@id='playlists']//li/a[text()='TestPlayListForDeleting']"))));


    }
}
