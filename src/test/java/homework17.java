import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.UUID;

public class homework17 extends BaseTest{


    @Test
    public void addSongToPlaylist() {

        login("dmytro.kravchuk@testpro.io", "Fr440003");


//WebElement addPlaylistButton = driver.findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
//addPlaylistButton.click();
//WebElement addPlaylist = driver.findElement(By.cssSelector("li[data-testid='playlist-context-menu-create-simple']"));
 //addPlaylist.click();
 //WebElement newPlaylistName = driver.findElement(By.cssSelector("i[title='Create a new playlist']"));
//String namePlaylist = UUID.randomUUID().toString();


        WebElement search = driver.findElement(By.cssSelector("input[type='search']"));
        search.sendKeys("F");
 WebElement brand = driver.findElement(By.cssSelector("[class='brand']"));
 brand.click();

WebElement allViewButton = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
allViewButton.click();
WebElement clickSong = driver.findElement(By.cssSelector("#songResultsWrapper > div > div > div.item-container > table > tr"));
clickSong.click();
WebElement addToButton = driver.findElement(By.cssSelector("[class='btn-add-to']"));
addToButton.click();
WebElement playlistNameNew = driver.findElement(By.xpath("//*[@id='queueWrapper']/header/div[3]/div/section[2]/form/input"));
playlistNameNew.sendKeys("HW17");
WebElement submitButton = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/header/div[3]/div/section[2]/form/button"));
submitButton.click();





    }

}
