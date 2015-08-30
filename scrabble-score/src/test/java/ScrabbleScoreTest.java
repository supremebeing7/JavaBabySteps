import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {
  @Test
  public void calculateScore_forWordWithOnlyOnePointValueLetters_three() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(3, testScrabbleScore.calculateScore("run"));
  }

  @Test
  public void calculateScore_forWordWithOneOrTwoPointValueLetters_five() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(5, testScrabbleScore.calculateScore("dog"));
  }

  @Test
  public void calculateScore_forWordWithOneTwoOrThreePointValueLetters_seven() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(7, testScrabbleScore.calculateScore("pigs"));
  }

  @Test
  public void calculateScore_forWordWithOneTwoThreeOrFourPointValueLetters_twelve() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(12, testScrabbleScore.calculateScore("piggy"));
  }

  @Test
  public void calculateScore_forWordWithOneTwoThreeFourOrFivePointValueLetters_fourteen() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(14, testScrabbleScore.calculateScore("viking"));
  }

  @Test
  public void calculateScore_forWordWithOneTwoThreeFourFiveOrEightPointValueLetters_nineteen() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(19, testScrabbleScore.calculateScore("jumpy"));
  }

  @Test
  public void calculateScore_forWordWithAnyPointValueLetters_twentyFive() {
    ScrabbleScore testScrabbleScore = new ScrabbleScore();
    assertEquals(25, testScrabbleScore.calculateScore("quickly"));
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