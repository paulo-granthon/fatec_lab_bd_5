package Ex1;

public class Triangle {

  public enum TriangleType {
    EQUILATERAL,
    ISOSCELES,
    SCALENE,
    INVALID
  }

  private static boolean isValidTriangle(int a, int b, int c) {
    return a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a;
  }

  public static TriangleType determineTriangleType(int a, int b, int c) {
    if (!isValidTriangle(a, b, c)) {
      return TriangleType.INVALID;
    }

    if (a == b && b == c) {
      return TriangleType.EQUILATERAL;
    }

    if (a == b || b == c || a == c) {
      return TriangleType.ISOSCELES;
    }

    return TriangleType.SCALENE;
  }
}
