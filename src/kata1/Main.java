package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Luis Hernandez", LocalDate.of(1900, Month.APRIL, 20));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
