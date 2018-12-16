package ru.qa.shaikin.game.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GameHelper extends HelperBase {

  public GameHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void loginForm(String username, String password) {
    type(username, By.id("login-form-username"));
    type(password, By.id("login-form-password"));
    click(By.cssSelector("button.sb-btn:nth-child(4)"));
  }

  public void playGame() {
    click(By.cssSelector("button.tile-menu__button:nth-child(3)"));
  }

  public void hoverOverGame() throws InterruptedException {
    Actions action = new Actions(wd);
    WebElement btn = wd.findElement(By.xpath("//section[@class='page__content search__content']/div/div/div[1]/div/div/div"));
    action.moveToElement(btn).perform();
    Thread.sleep(3000);
  }

  public void writeGame(String game) {
    type(game, By.xpath("//div[@class='sc-eNQAEJ gDsKHW']/input"));
  }

  public void startSearch() {
    click(By.xpath("//header[@class='wf-header desktop-version']/div[2]/button"));
  }
}
