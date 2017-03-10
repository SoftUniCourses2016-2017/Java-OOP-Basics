package salaryIncrease;

/**
 * Created by Magdalena on 9.3.2017 г..
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() < 30) {
            this.salary +=  bonus / 200 * this.salary;
        } else {
            this.salary += this.salary * bonus / 100;
        }
    }

    @Override
    public String toString(){
        return String.format(this.getFirstName() + " " +  this.getLastName() + " get " + this.getSalary() + " leva");
    }

}
