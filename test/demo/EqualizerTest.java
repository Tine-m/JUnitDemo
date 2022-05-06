package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualizerTest {


  @Test
  public void isEven() {
    //arrange
    Equalizer e = new Equalizer();

    //act
    boolean actual = e.isEven(6);

    //assert
    assertTrue(actual);
  }

  @Test
  public void isOdd() {
    //arrange
    Equalizer e = new Equalizer();

    //act
    boolean actual = e.isEven(7);

    //assert
    assertFalse(actual);
  }

}