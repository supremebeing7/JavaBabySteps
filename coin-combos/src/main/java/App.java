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

      String cents = request.queryParams("cents");
      String result = getResult(Integer.parseInt(cents));
      model.put("cents", cents);
      model.put("result", result);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String getResult(Integer cents) {
    Map<String, Integer> coins = new LinkedHashMap<String, Integer>();
    if ( cents / 25 > 0 ) {
      coins.put("quarter", cents / 25);
      cents = cents - (coins.get("quarter") * 25);
    }
    if ( cents / 10 > 0 ) {    
      coins.put("dime", cents / 10);
      cents = cents - (coins.get("dime") * 10);
    }
    if ( cents / 5 > 0 ) {    
      coins.put("nickel", cents / 5);
      cents = cents - (coins.get("nickel") * 5);
    }
    if ( cents > 0 ) {
      coins.put("penny", cents);
    }
    return formattedCoinDescription(coins);
  }

  public static String formattedCoinDescription(Map<String, Integer> coins) {
    String result = new String();
    int i = 1;
    for ( Map.Entry<String, Integer> entry : coins.entrySet()) {
      String coinType = entry.getKey();
      Integer numberOfCoins = entry.getValue();
      if ( numberOfCoins > 1 ) {
        coinType = pluralized(coinType);
      }
      result += numberOfCoins.toString() + " " + coinType;
      if ( i < coins.size() && coins.size() > 1 ) { 
        if ( i == 1 && coins.size() == 2 ) {
          result += " and ";
        } else if ( i <= coins.size() - 2 ) {
          result += ", ";
        } else {
          result += ", and ";
        }
      }
      i++;
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