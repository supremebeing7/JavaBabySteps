import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {
  @Test
  public void convertToWords_forZero_zero() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("zero", testNumbersToWords.convertToWords("0"));
  }

  @Test
  public void convertToWords_forNumbersEndingWithZeros_fiveThousandTwoHundred() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("five thousand two hundred", testNumbersToWords.convertToWords("5200"));
  }

  @Test
  public void convertToWords_forSingleDigitNumber_one() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("one", testNumbersToWords.convertToWords("1"));
  }

  @Test
  public void convertToWords_forNumberInTeens_twelve() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("twelve", testNumbersToWords.convertToWords("12"));
  }

  @Test
  public void convertToWords_forDoubleDigitNumber_twentyTwo() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("twenty-two", testNumbersToWords.convertToWords("22"));
  }

  @Test
  public void convertToWords_forRoundDoubleDigitNumber_sixty() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("sixty", testNumbersToWords.convertToWords("60"));
  }

  @Test
  public void convertToWords_forThreeDigitNumber_threeHundredThirtyThree() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("three hundred thirty-three", testNumbersToWords.convertToWords("333"));
  }

  @Test
  public void convertToWords_forFourDigitNumber_fourThousandFourHundredFortyFour() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("four thousand four hundred forty-four", testNumbersToWords.convertToWords("4444"));
  }

  @Test
  public void convertToWords_forFiveDigitNumber_fiftyFiveThousandFiveHundredFiftyFive() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("fifty-five thousand five hundred fifty-five", testNumbersToWords.convertToWords("55555"));
  }

  @Test
  public void convertToWords_forSevenDigitNumber_sevenMillionSevenHundredSeventySevenThousandSevenHundredSeventySeven() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("seven million seven hundred seventy-seven thousand seven hundred seventy-seven", testNumbersToWords.convertToWords("7777777"));
  }

  @Test
  public void convertToWords_forNineDigitNumber_nineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine() {
    NumbersToWords testNumbersToWords = new NumbersToWords();
    assertEquals("nine hundred ninety-nine million nine hundred ninety-nine thousand nine hundred ninety-nine", testNumbersToWords.convertToWords("999999999"));
  }
}