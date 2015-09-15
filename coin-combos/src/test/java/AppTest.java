import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void getResult_oneCent_onePenny() {
    App testApp = new App();
    assertEquals("1 penny", testApp.getResult(1));
  }
  @Test
  public void getResult_threeCents_threePennies() {
    App testApp = new App();
    assertEquals("3 pennies", testApp.getResult(3));
  }
  @Test
  public void getResult_fiveCents_oneNickel() {
    App testApp = new App();
    assertEquals("1 nickel", testApp.getResult(5));
  }
  @Test
  public void getResult_fifteenCents_oneDimeOneNickel() {
    App testApp = new App();
    assertEquals("1 dime and 1 nickel", testApp.getResult(15));
  }
  @Test
  public void getResult_tenCents_oneDime() {
    App testApp = new App();
    assertEquals("1 dime", testApp.getResult(10));
  }
  public void getResult_twentyCents_twoDimes() {
    App testApp = new App();
    assertEquals("2 dimes", testApp.getResult(20));
  }
  @Test
  public void getResult_twentyFiveCents_oneQuarter() {
    App testApp = new App();
    assertEquals("1 quarter", testApp.getResult(25));
  }
  @Test
  public void getResult_thirtyFiveCents_oneQuarterOneDime() {
    App testApp = new App();
    assertEquals("1 quarter and 1 dime", testApp.getResult(35));
  }
  @Test
  public void getResult_fortyCents_oneQuarterOneDimeOneNickel() {
    App testApp = new App();
    assertEquals("1 quarter, 1 dime, and 1 nickel", testApp.getResult(40));
  }
  @Test
  public void getResult_fortyOneCents_oneQuarterOneDimeOneNickelOnePenny() {
    App testApp = new App();
    assertEquals("1 quarter, 1 dime, 1 nickel, and 1 penny", testApp.getResult(41));
  }
  @Test
  public void getResult_ninetyNineCents_threeQuartersTwoDimesFourPennies() {
    App testApp = new App();
    assertEquals("3 quarters, 2 dimes, and 4 pennies", testApp.getResult(99));
  }
}