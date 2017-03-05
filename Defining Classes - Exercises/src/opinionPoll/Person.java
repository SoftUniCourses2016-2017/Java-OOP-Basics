package opinionPoll;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Person {
    public String name;
    private int age;

    public Person() {
        this(1);
    }

    public Person(int age){
        this("No name", age);

    }



    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
}
