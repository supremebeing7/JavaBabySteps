import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/result.vtl");

      // String playerSelection = request.queryParams("play");
      // String computerSelection = getRandomSelection();
      // String result = getResult(playerSelection.toLowerCase(), computerSelection);
      // String resultSentence = String.format("You played %s and the computer played %s.", playerSelection, computerSelection);
      // model.put("playerSelection", playerSelection);
      // model.put("computerSelection", computerSelection);
      // model.put("result", result.toUpperCase());
      // model.put("resultSentence", resultSentence);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String getResult(Integer cents) {
    Map<String, Integer> coins = new LinkedHashMap<String, Integer>();
    coins.put("quarter", cents / 25);
    cents = cents - (coins.get("quarter") * 25);
    coins.put("dime", cents / 10);
    cents = cents - (coins.get("dime") * 10);
    coins.put("nickel", cents / 5);
    cents = cents - (coins.get("nickel") * 5);
    coins.put("penny", cents);
    return formattedCoinDescription(coins);
  }

  public static String formattedCoinDescription(Map<String, Integer> coins) {
    String result = new String();
    for ( Map.Entry<String, Integer> entry : coins.entrySet()) {
      String coinType = entry.getKey();
      Integer numberOfCoins = entry.getValue();
      if ( numberOfCoins > 0 ) {
        if ( numberOfCoins > 1 ) {
          coinType = pluralized(coinType);
        }
        result += numberOfCoins.toString() + " " + coinType + " ";
      }
    }
    return result.trim();
  }

  public static String pluralized(String coinType) {
    if ( coinType == "penny" ) {
      return "pennies";
    } else {
      return coinType + "s";
    }
  }
}