package animalFarm;

/**
 * Created by Magdalena on 10.3.2017 г..
 */

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {

            if (name.length() < 1 || name.charAt(0) == ' ') {
                throw new IllegalArgumentException("Name cannot be empty.");
            }
            this.name = name;
        }

    private void setAge(int age){
        if (age > 15 || age < 0){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double getProductPerDay(){
        return calculateProductPerDay(this.getAge());

    }

    private double calculateProductPerDay(int age) {
        if (age < 6){
           return 2;
        }else if (age > 6 && age < 12){
            return 1;
        }
        else{
            return 0.75;
        }
    }



}
