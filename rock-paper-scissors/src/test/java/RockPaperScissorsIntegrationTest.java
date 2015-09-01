import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class RockPaperScissorsIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Rock Paper Scissors");
  }

  @Test
  public void playRock() {
    goTo("http://localhost:4567");
    click("#rock");
    assertThat(pageSource()).contains("You played rock and the computer played");
  }
  @Test
  public void playPaper() {
    goTo("http://localhost:4567");
    click("#paper");
    assertThat(pageSource()).contains("You played paper and the computer played");
  }
  @Test
  public void playScissors() {
    goTo("http://localhost:4567");
    click("#scissors");
    assertThat(pageSource()).contains("You played scissors and the computer played");
  }
}