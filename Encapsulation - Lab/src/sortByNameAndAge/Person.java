package sortByNameAndAge;

/**
 * Created by Magdalena on 6.3.2017 г..
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is a %d years old.", this.firstName, this.lastName, this.age);
    }
}
