import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
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

      String playerSelection = request.queryParams("play");
      String computerSelection = getRandomSelection();
      String result = getResult(playerSelection.toLowerCase(), computerSelection);
      model.put("playerSelection", playerSelection);
      model.put("computerSelection", computerSelection);
      model.put("result", result.toUpperCase());
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String getResult(String playerSelection, String computerSelection) {
    String result = "loss";
    if ( playerSelection.equals(computerSelection) ) {
      result = "tie";
    } else {
      switch (playerSelection) {
        case "rock": 
          if ( computerSelection.equals("scissors") ) {
            result = "win";
          }
          break;
        case "paper": 
          if ( computerSelection.equals("rock") ) {
            result = "win";
          } 
          break;
        case "scissors": 
          if ( computerSelection.equals("paper") ) {
            result = "win";
          } 
          break;
        default:
          result = "Invalid selection";
          break;
      }
    }
    return result;
  }

  public static String getRandomSelection() {
    String[] options = {"rock", "paper", "scissors"};
    Random randomSelectionMaker = new Random();
    Integer selection = randomSelectionMaker.nextInt(3);
    return options[selection];
  }
}