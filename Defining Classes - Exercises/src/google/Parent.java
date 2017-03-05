package google;

import java.time.format.DateTimeFormatter;

/**
 * Created by Magdalena on 1.3.2017 г..
 */
public class Parent {
    private String name;
    private String birthday;

    public Parent(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return this.name + " " + this.birthday;
    }
}
