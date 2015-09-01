import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  @Test
  public void getResult_rockBeatsScissors_win() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("win", testApp.getResult("rock", "scissors"));
  }
  @Test
  public void getResult_rockTiesRock_tie() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("tie", testApp.getResult("rock", "rock"));
  }
  @Test
  public void getResult_rockLosesToPaper_loss() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("loss", testApp.getResult("rock", "paper"));
  }
  @Test
  public void getResult_scissorsBeatsPaper_win() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("win", testApp.getResult("scissors", "paper"));
  }
  @Test
  public void getResult_paperBeatsRock_win() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("win", testApp.getResult("paper", "rock"));
  }
  @Test
  public void getResult_scissorsTiesScissors_tie() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("tie", testApp.getResult("scissors", "scissors"));
  }
  @Test
  public void getResult_paperTiesPaper_tie() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("tie", testApp.getResult("paper", "paper"));
  }
  @Test
  public void getResult_scissorsLosesToRock_loss() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("loss", testApp.getResult("scissors", "rock"));
  }
  @Test
  public void getResult_paperLosesToScissors_loss() {
    RockPaperScissors testApp = new RockPaperScissors();
    assertEquals("loss", testApp.getResult("paper", "scissors"));
  }
}