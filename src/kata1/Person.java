package kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthday;
    private final String na;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        na ="";
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public int getAge(){
        return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYear(long days) {
        return (int) (days/365);
    }
    
}
