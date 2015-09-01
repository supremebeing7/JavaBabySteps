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

  // @Test
  //   public void submitForm() {
  //     goTo("http://localhost:4567");
  //     fill("#number").with("2004");
  //     submit(".btn");
  //     assertThat(pageSource()).contains("in words:");
  //     assertThat(pageSource()).contains("two thousand four");
  //   }
}