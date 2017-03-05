package google;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Magdalena on 1.3.2017 г..
 */
public class Child {
    private String name;
    private String birthday;

    public Child(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return this.name + " " + this.birthday;
    }
}
