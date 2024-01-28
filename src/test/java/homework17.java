import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.UUID;

public class homework17 extends BaseTest{


    @Test
    public void addSongToPlaylist() {

        login("dmytro.kravchuk@testpro.io", "Fr440003");
       // WebElement addNewPlaylist = driver.findElement(By.cssSelector(""));

WebElement addPlaylistButton = driver.findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
addPlaylistButton.click();
WebElement addPlaylist = driver.findElement(By.cssSelector("li[data-testid='playlist-context-menu-create-simple']"));
 addPlaylist.click();
 WebElement newPlaylistName = driver.findElement(By.cssSelector("i[title='Create a new playlist']"));
String namePlaylist = UUID.randomUUID().toString();


        WebElement search = driver.findElement(By.cssSelector("input[type='search']"));

    }

}
