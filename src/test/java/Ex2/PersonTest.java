package Ex2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonDAOTest {

  @Test
  @DisplayName("Test valid person")
  public void testValidPerson() {
    Person person = new Person(1, "John Doe", 25);
    person.addEmail(new Email(1, "john.doe@example.com"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.isEmpty(), "A valid person should return an empty error list");
  }

  @Test
  @DisplayName("Test invalid name (only one part)")
  public void testInvalidNameOnePart() {
    Person person = new Person(1, "John", 25);
    person.addEmail(new Email(1, "john.doe@example.com"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Name must contain at least two parts"));
  }

  @Test
  @DisplayName("Test invalid name (contains non-letter characters)")
  public void testInvalidNameNonLetter() {
    Person person = new Person(1, "John123 Doe", 25);
    person.addEmail(new Email(1, "john.doe@example.com"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Name must contain only letters"));
  }

  @Test
  @DisplayName("Test invalid age (less than 1)")
  public void testInvalidAgeLow() {
    Person person = new Person(1, "John Doe", 0);
    person.addEmail(new Email(1, "john.doe@example.com"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Age must be between 1 and 200"));
  }

  @Test
  @DisplayName("Test invalid age (greater than 200)")
  public void testInvalidAgeHigh() {
    Person person = new Person(1, "John Doe", 201);
    person.addEmail(new Email(1, "john.doe@example.com"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Age must be between 1 and 200"));
  }

  @Test
  @DisplayName("Test no associated email")
  public void testNoAssociatedEmail() {
    Person person = new Person(1, "John Doe", 25);
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Person must have at least one email"));
  }

  @Test
  @DisplayName("Test invalid email format")
  public void testInvalidEmailFormat() {
    Person person = new Person(1, "John Doe", 25);
    person.addEmail(new Email(1, "invalid-email"));
    List<String> errors = PersonDAO.isValidToInclude(person);
    assertTrue(errors.contains("Email must be in the format '____@____.____'"));
  }
}
