package Ex2;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
  private int id;
  private String name;
  private int age;
  private List<Email> emails;

  public Person(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.emails = new ArrayList<>();
  }

  public void addEmail(Email email) {
    this.emails.add(email);
  }

  public void removeEmail(Email email) {
    this.emails.remove(email);
  }
}
