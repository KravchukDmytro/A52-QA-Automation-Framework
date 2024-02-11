import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Homework21 extends BaseTest{
    String newPlayListName = "NewPlayListName";
    String currentPlayListName = "HW17";
    @Test
    public void renamePlaylist() throws InterruptedException {

        login("dmytro.kravchuk@testpro.io", "Fr440003");
        WebElement playList =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format("//section[@id='playlists']//li/a[text()='%s']", currentPlayListName))));
Thread.sleep(3000);
        actions.contextClick(playList).perform();
        WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@data-testid, 'playlist-context-menu-edit')]")));
editButton.click();
WebElement inputPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li//input[@type='text']")));
for (int i=0; i>currentPlayListName.length(); i++) {
    inputPlayListName.sendKeys(Keys.BACK_SPACE);
}
inputPlayListName.sendKeys(newPlayListName);
inputPlayListName.sendKeys(Keys.ENTER);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'success')]")));
        Assert.assertEquals(newPlayListName, playList.getText());

        playList =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format("//section[@id='playlists']//li/a[text()='%s']", newPlayListName))));
        Thread.sleep(3000);
        actions.contextClick(playList).perform();
        editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@data-testid, 'playlist-context-menu-edit')]")));
        editButton.click();
        inputPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li//input[@type='text']")));
        for (int i=0; i>newPlayListName.length(); i++) {
            inputPlayListName.sendKeys(Keys.BACK_SPACE);
        }
        inputPlayListName.sendKeys(currentPlayListName);
        inputPlayListName.sendKeys(Keys.ENTER);



    }
//    @AfterMethod
//    public void rollBackPlayListName() {
//        WebElement inputPlayListName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li//input[@type='text']")));
//
//        for (int i=0; i>newPlayListName.length(); i++) {
//            inputPlayListName.sendKeys(Keys.BACK_SPACE);
//        }
//        inputPlayListName.sendKeys(currentPlayListName);
//        inputPlayListName.sendKeys(Keys.ENTER);
//
//    }
}
