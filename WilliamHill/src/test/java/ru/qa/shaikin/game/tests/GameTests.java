package ru.qa.shaikin.game.tests;

import org.testng.annotations.Test;

public class GameTests extends TestBase {

  @Test
  public void testGame() throws InterruptedException {
    app.getGameHelper().startSearch();
    app.getGameHelper().writeGame("mayfair roulette");
    app.getGameHelper().hoverOverGame();
    app.getGameHelper().playGame();
    app.getGameHelper().loginForm("adminadmin", "password");
  }

}
