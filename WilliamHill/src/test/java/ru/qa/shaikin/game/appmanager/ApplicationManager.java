package ru.qa.shaikin.game.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  FirefoxDriver wd;

  private GameHelper gameHelper;

  public void init() {
    wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("https://vegas.williamhill.com/");
    gameHelper = new GameHelper(wd);
  }

  public void stop() {
    wd.quit();
  }

  public GameHelper getGameHelper() {
    return gameHelper;
  }
}
