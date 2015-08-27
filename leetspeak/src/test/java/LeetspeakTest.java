import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {
  @Test
  public void leetspeak_forWordWithNoLeetspeak_wordDoesNotChange() {
    Leetspeak app = new Leetspeak();
    assertEquals("fifty", app.leetspeak("fifty"));
  }
  @Test
  public void leetspeak_forWordWithEs_replaceEs() {
    Leetspeak app = new Leetspeak();
    assertEquals("by3by3", app.leetspeak("byebye"));
  }
  @Test
  public void leetspeak_forWordWithCapitalEs_replaceEs() {
    Leetspeak app = new Leetspeak();
    assertEquals("BY3BY3", app.leetspeak("BYEBYE"));
  }
  @Test
  public void leetspeak_forWordWithOs_replaceOs() {
    Leetspeak app = new Leetspeak();
    assertEquals("b00m", app.leetspeak("boom"));
  }
  @Test
  public void leetspeak_forWordWithCapitalOs_replaceOs() {
    Leetspeak app = new Leetspeak();
    assertEquals("B00M", app.leetspeak("BOOM"));
  }
  @Test
  public void leetspeak_forWordWithIs_replaceIs() {
    Leetspeak app = new Leetspeak();
    assertEquals("1ndig0", app.leetspeak("Indigo"));
  }
  @Test
  public void leetspeak_forWordWithSs_replaceSs() {
    Leetspeak app = new Leetspeak();
    assertEquals("hizz", app.leetspeak("hiss"));
  }
  @Test
  public void leetspeak_forWordWithCapitalSs_replaceSs() {
    Leetspeak app = new Leetspeak();
    assertEquals("H1ZZ", app.leetspeak("HISS"));
  }
  @Test
  public void leetspeak_makesCorrectReplacesmentsRegardlessOfCase_ignoresUppercase() {
    Leetspeak app = new Leetspeak();
    assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", app.leetspeak("I scream you scream we all scream for raspberry ice cream!"));
  }
}