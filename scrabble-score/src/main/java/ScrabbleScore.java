import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ScrabbleScore {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/score", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/score.vtl");

      String word = request.queryParams("word");
      Integer score = calculateScore(word);
      model.put("word", word);
      model.put("score", score);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Integer calculateScore(String word) {
    String[] letters = word.split("");
    Integer score = 0;
    for ( String letter : letters ) {
      score += letterPointValue(letter);
    }
    return score;
  }

  public static Integer letterPointValue(String letter) {
    String lowerCaseLetter = letter.toLowerCase();
    if ( onePointLetter(lowerCaseLetter) ) {
      return 1;
    } else if ( twoPointLetter(lowerCaseLetter) ) {
      return 2;
    } else if ( threePointLetter(lowerCaseLetter) ) {
      return 3;
    } else if ( fourPointLetter(lowerCaseLetter) ) {
      return 4;
    } else if ( fivePointLetter(lowerCaseLetter) ) {
      return 5;
    } else if ( eightPointLetter(lowerCaseLetter) ) {
      return 8;
    } else if ( tenPointLetter(lowerCaseLetter) ) {
      return 10;
    } else {
      return 0;
    }
  }

  public static Boolean onePointLetter(String letter) {
    return "aeioulnrst".contains(letter);
  }

  public static Boolean twoPointLetter(String letter) {
    return "dg".contains(letter);
  }

  public static Boolean threePointLetter(String letter) {
    return "bcmp".contains(letter);
  }

  public static Boolean fourPointLetter(String letter) {
    return "fhvwy".contains(letter);
  }

  public static Boolean fivePointLetter(String letter) {
    return "k".equals(letter);
  }

  public static Boolean eightPointLetter(String letter) {
    return "jx".contains(letter);
  }

  public static Boolean tenPointLetter(String letter) {
    return "qz".contains(letter);
  }
}




// Points:
// A, E, I, O, U, L, N, R, S, T       1
// D, G                               2
// B, C, M, P                         3
// F, H, V, W, Y                      4
// K                                  5
// J, X                               8
// Q, Z                               10