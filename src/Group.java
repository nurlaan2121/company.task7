import java.time.LocalDate;

public class Group {
    String gruopname;
    LocalDate StartlocalDate;
    Person mentor;

    public Group() {
    }

    public Group(String gruopname, LocalDate startlocalDate, Person mentor) {
        this.gruopname = gruopname;
        this.StartlocalDate = startlocalDate;
        this.mentor = mentor;
    }
}
