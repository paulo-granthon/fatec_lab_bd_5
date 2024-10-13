package Ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeTest {

  @Test
  void testCalculateSalaryForDeveloperWithHighSalary() {
    Employee employee = new Employee("Alice", "alice@example.com", 3000.00, Position.DEVELOPER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(2400.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForDeveloperWithLowSalary() {
    Employee employee = new Employee("Bob", "bob@example.com", 2500.00, Position.DEVELOPER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(2250.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForDBAWithHighSalary() {
    Employee employee = new Employee("Charlie", "charlie@example.com", 2500.00, Position.DBA);
    double netSalary = employee.calculateNetSalary();
    assertEquals(1875.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForDBAWithLowSalary() {
    Employee employee = new Employee("Dave", "dave@example.com", 1800.00, Position.DBA);
    double netSalary = employee.calculateNetSalary();
    assertEquals(1530.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForTesterWithHighSalary() {
    Employee employee = new Employee("Eve", "eve@example.com", 2200.00, Position.TESTER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(1650.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForTesterWithLowSalary() {
    Employee employee = new Employee("Frank", "frank@example.com", 1500.00, Position.TESTER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(1275.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForManagerWithHighSalary() {
    Employee employee = new Employee("Grace", "grace@example.com", 6000.00, Position.MANAGER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(4200.00, netSalary, 0.01);
  }

  @Test
  void testCalculateSalaryForManagerWithLowSalary() {
    Employee employee = new Employee("Heidi", "heidi@example.com", 4000.00, Position.MANAGER);
    double netSalary = employee.calculateNetSalary();
    assertEquals(3200.00, netSalary, 0.01);
  }
}
