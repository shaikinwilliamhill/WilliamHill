package ru.qa.shaikin.game.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GameHelper {
  private FirefoxDriver wd;

  public GameHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void loginForm(String username, String password) {
    wd.findElement(By.id("login-form-username")).click();
    wd.findElement(By.id("login-form-username")).clear();
    wd.findElement(By.id("login-form-username")).sendKeys(username);
    wd.findElement(By.id("login-form-password")).click();
    wd.findElement(By.id("login-form-password")).clear();
    wd.findElement(By.id("login-form-password")).sendKeys(password);
    wd.findElement(By.cssSelector("button.sb-btn:nth-child(4)")).click();
  }

  public void playGame() {
    wd.findElement(By.cssSelector("button.tile-menu__button:nth-child(3)")).click();
  }

  public void hoverOverGame() throws InterruptedException {
    Actions action = new Actions(wd);
    WebElement btn = wd.findElement(By.xpath("//section[@class='page__content search__content']/div/div/div[1]/div/div/div"));
    action.moveToElement(btn).perform();
    Thread.sleep(3000);
  }

  public void writeGame(String game) {
    wd.findElement(By.xpath("//div[@class='sc-eNQAEJ gDsKHW']/input")).click();
    wd.findElement(By.xpath("//div[@class='sc-eNQAEJ gDsKHW']/input")).clear();
    wd.findElement(By.xpath("//div[@class='sc-eNQAEJ gDsKHW']/input")).sendKeys(game);
  }

  public void startSearch() {
    wd.findElement(By.xpath("//header[@class='wf-header desktop-version']/div[2]/button")).click();
  }
}
