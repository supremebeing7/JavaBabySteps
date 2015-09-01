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
}