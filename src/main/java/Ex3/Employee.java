package Ex3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private String name;
  private String email;
  private double baseSalary;
  private Position position;

  public double calculateNetSalary() {
    double discountRate = getDiscountRate();
    return baseSalary * (1 - discountRate);
  }

  private double getDiscountRate() {
    switch (position) {
      case DEVELOPER:
        return baseSalary >= 3000.00 ? 0.20 : 0.10;
      case DBA:
        return baseSalary >= 2000.00 ? 0.25 : 0.15;
      case TESTER:
        return baseSalary >= 2000.00 ? 0.25 : 0.15;
      case MANAGER:
        return baseSalary >= 5000.00 ? 0.30 : 0.20;
      default:
        throw new IllegalArgumentException("Unknown position: " + position);
    }
  }
}
