import java.time.LocalDate;

public class Company {
    Group group = new Group("Java",LocalDate.of(2023,1,15),new Person());
    Group group2 = new Group("JS",LocalDate.of(2023,1,15),new Person());
    String companyName;
    String country;
    LocalDate yaerOfFounderlocalDate;
    Person founder;
    Group[] groups;
    Group []massiveForGroups  = {group,group2};

    public Company() {
    }

    public Company(String companyName, String country, LocalDate yaerOfFounderlocalDate, Person founder) {
        this.country = country;
        this.founder = founder;
        this.companyName = companyName;
        this.yaerOfFounderlocalDate = yaerOfFounderlocalDate;
    }


}
