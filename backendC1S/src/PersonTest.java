import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static junit.framework.TestCase.assertEquals;


class PersonTest {
    Person personN1;
    Person personN2;

    @BeforeEach
    void setUp() {
        personN1 = new Person("John", "Doe", 23, "Doctor", LocalDate.of(1980, 9, 21));
        personN2 = new Person("Jane", "Doe", 23, "Doctor", LocalDate.of(2019, 9, 21));
    }

    @Test
    void testGetFullName() {
        assertEquals("Doe, John", personN1.getFullName());
    }

    @Test
    void testCalcIs18YearsOld() {
        assertEquals(true, personN1.calcIs18YearsOld());
        System.out.println(personN1.calcIs18YearsOld());
    }
}