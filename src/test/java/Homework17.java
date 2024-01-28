import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Homework17 extends BaseTest{
    @Test
    public void addSongToPlaylist() {

        login("dmytro.kravchuk@testpro.io", "Fr440003");
       // WebElement addNewPlaylist = driver.findElement(By.cssSelector(""));
WebElement search = driver.findElement(By.cssSelector("input[type='search']"));
WebElement addPlaylistButton = driver.findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
addPlaylistButton.click();
WebElement addPlaylist = driver.findElement(By.cssSelector("li[data-testid='playlist-context-menu-create-simple']"));
 addPlaylist.click();
 WebElement newPlaylistName = driver.findElement(By.cssSelector("i[title='Create a new playlist']"));

 newPlaylistName.sendKeys("HW17");
newPlaylistName.sendKeys(Keys.ENTER);
    }

}
