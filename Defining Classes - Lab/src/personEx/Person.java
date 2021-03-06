package personEx;

import bankAccEx.BankAccount;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magdalena on 25.2.2017 г..
 */
public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public Person(String name, int age){
        this(name, age, new ArrayList<>());
    }

    public Person(String name, int age, List<BankAccount> accounts){
      this.name = name;
      this.age = age;
        this.accounts = accounts;
    }
}
