import java.time.LocalDate;

public class Person {
    String fistName;
    String lastName;
    LocalDate localDate;

    public Person() {
    }

    public Person(String fistName, String lastName, LocalDate localDate) {
        this.localDate = localDate;
        this.lastName = lastName;
        this.fistName = fistName;
    }

}
