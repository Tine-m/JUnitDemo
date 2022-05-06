package demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
  public void sumPositiveNumbers() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    int actual = calculator.sum(10, 5);


    //Assert
    int expected = 15;
    assertEquals(expected, actual);
  }

  @Test
  public void sumNegativeNumbers() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    int actual = calculator.sum(-10, 5);


    //Assert
    int expected = -5;
    assertEquals(expected, actual);
  }

  @Test
  public void sumVeryLargeNumbers() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    //Assert
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    });
  }

  @Test
  public void sumLargeNumbers() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    //Assert
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.sum(101,101);
    });
  }
}