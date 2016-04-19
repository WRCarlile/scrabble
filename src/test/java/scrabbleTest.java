import org.junit.*;
import static org.junit.Assert.*;

public class scrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("A"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("D"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("B"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 4;
    assertEquals(expected, testScrabble.calculateScore("F"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("K"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_8() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 8;
    assertEquals(expected, testScrabble.calculateScore("J"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("Q"));
  }

  @Test
  public void calculateScore_returnsScoreForWord_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("CAT"));
  }



}
