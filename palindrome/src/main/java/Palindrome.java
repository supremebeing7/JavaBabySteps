import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Palindrome {
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

  public static Boolean isPalindrome(Object input) {
    return true;
  }
}