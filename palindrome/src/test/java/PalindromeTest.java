import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeTest {
  @Test
  public void isPalindrome_singleLetterWord_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("a"));
  }
  @Test
  public void isPalindrome_twoLetterWord_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("aa"));
  }
  @Test
  public void isPalindrome_twoLetterWordNonPalindrome_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("be"));
  }
  @Test
  public void isPalindrome_longEvenNumberOfCharsWordPalindrome_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("tattarrattat"));
  }
  @Test
  public void isPalindrome_longEvenNumberOfCharsWordNonPalindrome_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("tattaratat"));
  }
  @Test
  public void isPalindrome_oddNumberOfCharsWordPalindrome_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("civic"));
  }
  @Test
  public void isPalindrome_oddNumberOfCharsWordNonPalindrome_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("raver"));
  }
  @Test
  public void isPalindrome_numberPalindrome_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("12321"));
  }
  @Test
  public void isPalindrome_numberNonPalindrome_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("1232421"));
  }
  @Test
  public void isPalindrome_fullSentencePalindrome_true() {
    Palindrome testApp = new Palindrome();
    assertEquals(true, testApp.isPalindrome("Straw? No, too stupid a fad. I put soot on warts."));
  }
  @Test
  public void isPalindrome_fullSentenceNonPalindrome_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("Straw? No, too stupid a fad. I only put soot on warts."));
  }
  @Test
  public void formattedInput_sentenceWithSpecialChars_specialCharsRemoved() {
    Palindrome testApp = new Palindrome();
    assertEquals("strawnotoostupidafadiputsootonwarts", testApp.formattedInput("Straw? No, too stupid a fad. I put soot on warts."));
  }
}