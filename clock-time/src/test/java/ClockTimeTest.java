import org.junit.*;
import static org.junit.Assert.*;

public class ClockTimeTest {
  @Test
  public void angleDistance_forTwelveOClock_zero() {
    ClockTime app = new ClockTime();
    assertEquals((Double)0.0, app.angleDistance("12:00"));
  }
  @Test
  public void angleDistance_forSixOClock_oneHundredEighty() {
    ClockTime app = new ClockTime();
    assertEquals((Double)180.0, app.angleDistance("6:00"));
  }
  @Test
  public void angleDistance_forSevenOClock_oneHundredFifty() {
    ClockTime app = new ClockTime();
    assertEquals((Double)150.0, app.angleDistance("07:00"));
  }
  @Test
  public void angleDistance_forTwelveThirty_oneSixtyFive() {
    ClockTime app = new ClockTime();
    assertEquals((Double)165.0, app.angleDistance("12:30"));
  }
  @Test
  public void angleDistance_forElevenFiftyNine_fivePointFive() {
    ClockTime app = new ClockTime();
    assertEquals((Double)5.5, app.angleDistance("11:59"));
  }
  @Test
  public void angleDistance_forElevenTwenty_oneForty() {
    ClockTime app = new ClockTime();
    assertEquals((Double)140.0, app.angleDistance("11:20"));
  }
}