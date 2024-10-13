package Ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleTest {

  @Test
  @DisplayName("Test valid scalene triangle")
  public void testValidScaleneTriangle() {
    assertEquals(Triangle.TriangleType.SCALENE, Triangle.determineTriangleType(3, 4, 5));
  }

  @Test
  @DisplayName("Test valid isosceles triangle")
  public void testValidIsoscelesTriangle() {
    assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.determineTriangleType(5, 5, 3));
  }

  @Test
  @DisplayName("Test valid equilateral triangle")
  public void testValidEquilateralTriangle() {
    assertEquals(Triangle.TriangleType.EQUILATERAL, Triangle.determineTriangleType(5, 5, 5));
  }

  @Test
  @DisplayName("Test valid isosceles triangle (permutation 1)")
  public void testValidIsoscelesTrianglePermutation1() {
    assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.determineTriangleType(5, 3, 5));
  }

  @Test
  @DisplayName("Test valid isosceles triangle (permutation 2)")
  public void testValidIsoscelesTrianglePermutation2() {
    assertEquals(Triangle.TriangleType.ISOSCELES, Triangle.determineTriangleType(3, 5, 5));
  }

  @Test
  @DisplayName("Test triangle with zero value")
  public void testZeroValue() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(0, 5, 5));
  }

  @Test
  @DisplayName("Test triangle with negative value")
  public void testNegativeValue() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(-1, 5, 5));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides equals the third")
  public void testSumOfTwoSidesEqualsThird() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(2, 3, 5));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides equals the third (permutation 1)")
  public void testSumOfTwoSidesEqualsThirdPermutation1() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(5, 2, 3));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides equals the third (permutation 2)")
  public void testSumOfTwoSidesEqualsThirdPermutation2() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(3, 5, 2));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides is less than the third")
  public void testSumOfTwoSidesLessThanThird() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(1, 2, 5));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides is less than the third (permutation 1)")
  public void testSumOfTwoSidesLessThanThirdPermutation1() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(5, 1, 2));
  }

  @Test
  @DisplayName("Test triangle where sum of two sides is less than the third (permutation 2)")
  public void testSumOfTwoSidesLessThanThirdPermutation2() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(2, 5, 1));
  }

  @Test
  @DisplayName("Test triangle with all zero values")
  public void testAllZeroValues() {
    assertEquals(Triangle.TriangleType.INVALID, Triangle.determineTriangleType(0, 0, 0));
  }
}
