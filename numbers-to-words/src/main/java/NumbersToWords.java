import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {
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

      String number = request.queryParams("number");
      String words = convertToWords(number);
      model.put("number", number);
      model.put("words", words);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String convertToWords(String numberString) {
    String numberWords = new String();

    if ( numberString.length() <= 3 ) {
      numberWords = getHundredsDigits(Integer.parseInt(numberString));
    } else if ( numberString.length() > 3 && numberString.length() <= 6 ) {
      String thousands = numberString.substring(0, numberString.length() - 3);
      numberWords = getHundredsDigits(Integer.parseInt(thousands)) + " thousand ";
      String hundreds = numberString.substring(numberString.length() - 3, numberString.length());
      numberWords += getHundredsDigits(Integer.parseInt(hundreds));
    } else if ( numberString.length() > 6 && numberString.length() <= 9 ) {
      String millions = numberString.substring(0, numberString.length() - 6);
      numberWords = getHundredsDigits(Integer.parseInt(millions)) + " million ";
      String thousands = numberString.substring(numberString.length() - 6, numberString.length() - 3);
      numberWords += getHundredsDigits(Integer.parseInt(thousands)) + " thousand ";
      String hundreds = numberString.substring(numberString.length() - 3, numberString.length());
      numberWords += getHundredsDigits(Integer.parseInt(hundreds));
    }
    return numberWords;
  }

  public static String getHundredsDigits(Integer number) {
    String numberWords = new String();
    if ( number >= 100 ) {
      numberWords = getSingleDigit(number/100);
      numberWords += " hundred ";
    }
    numberWords += getTensAndOnesDigits(number%100);
    return numberWords;
  }

  public static String getTensAndOnesDigits(Integer number) {
    String numberWord = new String();
    if ( number == 0 ) {
      numberWord = "zero";
    } else if ( number < 10 ) {
      numberWord = getSingleDigit(number);
    } else if ( number >= 10 && number < 20 ) {
      numberWord = getTeensDigits(number);
    } else {
      numberWord = getTensDigit(number);
      numberWord += getSingleDigit(number%10);
    }
    return numberWord;
  }

  public static String getSingleDigit(Integer number) {
    String numberWord = new String();

    switch (number) {
      case 1: numberWord = "one";
        break;
      case 2: numberWord = "two";
        break;
      case 3: numberWord = "three";
        break;
      case 4: numberWord = "four";
        break;
      case 5: numberWord = "five";
        break;
      case 6: numberWord = "six";
        break;
      case 7: numberWord = "seven";
        break;
      case 8: numberWord = "eight";
        break;
      case 9: numberWord = "nine";
        break;
    }

    return numberWord;
  }

  public static String getTeensDigits(Integer number) {
    String numberWord = new String();

    switch (number) {
      case 10: numberWord = "ten";
        break;
      case 11: numberWord = "eleven";
        break;
      case 12: numberWord = "twelve";
        break;
      case 13: numberWord = "thirteen";
        break;
      case 14: numberWord = "fourteen";
        break;
      case 15: numberWord = "fifteen";
        break;
      case 16: numberWord = "sixteen";
        break;
      case 17: numberWord = "seventeen";
        break;
      case 18: numberWord = "eighteen";
        break;
      case 19: numberWord = "nineteen";
        break;
    }

    return numberWord;
  }

  public static String getTensDigit(Integer number) {
    String numberWord = new String();

    switch (number/10) {
      case 2: numberWord = "twenty";
        break;
      case 3: numberWord = "thirty";
        break;
      case 4: numberWord = "forty";
        break;
      case 5: numberWord = "fifty";
        break;
      case 6: numberWord = "sixty";
        break;
      case 7: numberWord = "seventy";
        break;
      case 8: numberWord = "eighty";
        break;
      case 9: numberWord = "ninety";
        break;
    }
    if ( number % 10 != 0 ) {
      numberWord += "-";
    }

    return numberWord;
  }
}