package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    By avatar = By.cssSelector("#userBadge img");
    By addPlayListButton = By.cssSelector("#playlists i[role='button']");
    By createPlayListButton = By.cssSelector("[data-testid='playlist-context-menu-create-simple']");
    By playListNameInput = By.cssSelector("[name='create-simple-playlist-form']>input");


    public HomePage(WebDriver existDriver) {
        super(existDriver);
    }

    public WebElement getAvatar() {
        return findElement(avatar);
    }

    public WebElement getAddPlayListButton(WebDriverWait wait) {
        return waitAndFindWebElement(wait, addPlayListButton);
    }

    public WebElement getCreatePlayListButton(WebDriverWait wait) {
        return waitAndFindWebElement(wait, createPlayListButton);

    }

    public WebElement getPlayListNameInput(WebDriverWait wait) {
        return waitAndFindWebElement(wait, playListNameInput);

    }

    public void createPlayList(Actions actions, WebDriverWait wait, String playListName) {
        //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("i[data-testid='sidebar-create-playlist-btn']")));
        actions.moveToElement(getAddPlayListButton(wait)).perform();
        getAddPlayListButton(wait).click();
        getCreatePlayListButton(wait).click();
        getPlayListNameInput(wait).sendKeys(playListName);
        getPlayListNameInput(wait).sendKeys(Keys.ENTER);
    }

    public WebElement getPlayListByName(String playListName) {
        return findElement(By.xpath(String.format("//section[@id='playlists']//li/a[text()='%s']", playListName)));

    }

    public void openPlayList(String playListName) {
        getPlayListByName(playListName).click();
    }
}
