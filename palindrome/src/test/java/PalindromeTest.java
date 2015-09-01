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
  public void isPalindrome_twoLetterWord_false() {
    Palindrome testApp = new Palindrome();
    assertEquals(false, testApp.isPalindrome("be"));
  }
}