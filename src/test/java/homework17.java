import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homework17 extends BaseTest{


    @Test





//WebElement addPlaylistButton = driver.findElement(By.cssSelector("[data-testid='sidebar-create-playlist-btn']"));
//addPlaylistButton.click();
//WebElement addPlaylist = driver.findElement(By.cssSelector("li[data-testid='playlist-context-menu-create-simple']"));
 //addPlaylist.click();
 //WebElement newPlaylistName = driver.findElement(By.cssSelector("i[title='Create a new playlist']"));
//String namePlaylist = UUID.randomUUID().toString();


//        WebElement search = driver.findElement(By.cssSelector("input[type='search']"));
//        search.sendKeys("F");
// WebElement brand = driver.findElement(By.cssSelector("[class='brand']"));
// brand.click();
//
//WebElement allViewButton = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
//allViewButton.click();
//WebElement clickSong = driver.findElement(By.cssSelector("#songResultsWrapper > div > div > div.item-container > table > tr"));
//clickSong.click();
//WebElement addToButton = driver.findElement(By.cssSelector("[class='btn-add-to']"));
//addToButton.click();
//WebElement playlistNameNew = driver.findElement(By.xpath("//*[@id='queueWrapper']/header/div[3]/div/section[2]/form/input"));
//playlistNameNew.sendKeys("HW17");
//WebElement submitButton = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/header/div[3]/div/section[2]/form/button"));
//submitButton.click();
//

        public void addSongToPlayListTest() throws InterruptedException {
            String songName = "Riqui-Riqui";
        login("dmytro.kravchuk@testpro.io", "Fr440003");
            WebElement searchInput = driver.findElement(By.cssSelector("#searchForm>input"));
            searchInput.sendKeys(songName);
            searchInput.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            WebElement likeButton = driver.findElement(By.xpath("//section[@id='searchExcerptsWrapper']//button[contains(@title, 'Riqui-Riqui')]/i[@data-test='btn-like-unliked']"));
            likeButton.click();
            WebElement favoritePlayListLink = driver.findElement(By.xpath("//li[contains(@class, 'favorites')]/a"));
            favoritePlayListLink.click();
            String favoriteSong = "//section[@id='favoritesWrapper']//td[contains(text(), '%s')]";
            WebElement favoriteSongElement = driver.findElement(By.xpath(String.format(favoriteSong, songName)));
            Assert.assertTrue(favoriteSongElement.isDisplayed());



    }

}
