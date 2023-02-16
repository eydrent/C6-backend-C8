import java.time.LocalDate;
public class Person {
    private final String name;
    private final String lastName;
    private final int age;
    private final String occupation;

    private final LocalDate birthDate;

    public Person(String name, String lastName, int age, String occupation, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getOccupation() {
        return this.occupation;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public boolean calcIs18YearsOld() {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - this.birthDate.getYear();
        if (today.getMonthValue() < this.birthDate.getMonthValue()) {
            age--;
        } else if (today.getMonthValue() == this.birthDate.getMonthValue() && today.getDayOfMonth() < this.birthDate.getDayOfMonth()) {
            age--;
        }
        System.out.println(age);
        return age >= 18;
    }

    public String getFullName() {
        return this.lastName + ", " + this.name;
    }
}
