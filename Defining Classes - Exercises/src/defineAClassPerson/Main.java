package defineAClassPerson;

import java.lang.reflect.Field;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Main {

        public static void main(String[] args) {
            Class person = Person.class;
            Field[] fields = person.getDeclaredFields();
            System.out.println(fields.length);
        }
    }

