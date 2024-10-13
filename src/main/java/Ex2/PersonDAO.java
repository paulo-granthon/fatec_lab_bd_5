package Ex2;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {
  public static List<String> isValidToInclude(Person p) {
    List<String> errors = new ArrayList<>();

    String[] nameParts = p.getName().split(" ");
    if (nameParts.length < 2) {
      errors.add("Name must contain at least two parts");
    } else {
      for (String part : nameParts) {
        if (!part.matches("[a-zA-Z]+")) {
          errors.add("Name must contain only letters");
          break;
        }
      }
    }

    if (p.getAge() < 1 || p.getAge() > 200) {
      errors.add("Age must be between 1 and 200");
    }

    if (p.getEmails().isEmpty()) {
      errors.add("Person must have at least one email");
    } else {
      for (Email email : p.getEmails()) {
        if (!email.getName().matches(".+@.+\\..+")) {
          errors.add("Email must be in the format '____@____.____'");
          break;
        }
      }
    }

    return errors;
  }
}
