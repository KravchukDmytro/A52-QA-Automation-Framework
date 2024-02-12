package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayListPage extends BasePage{
    By deleteButton = By.xpath("//button[contains(@class, 'btn-delete-playlist')]");

    public PlayListPage(WebDriver existDriver) {
        super(existDriver);
    }
    public WebElement getDeletePlayListButton(WebDriverWait wait){
        return waitAndFindWebElement(deleteButton);
    }
    public void deletePlayList(WebDriverWait wait) {
        getDeletePlayListButton(wait).click();
    }
}
