package companyRoster;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Person {
    private static final int DEFAULT_AGE = -1;

    public String name;
    private int age;

    public Person(String name) {
        this(name, DEFAULT_AGE);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
}
