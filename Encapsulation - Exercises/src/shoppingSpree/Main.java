package shoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> people = new LinkedHashMap<>();
        String[] peopleArgs = reader.readLine().split(";");
        for (String personArg : peopleArgs) {
            String[] personInfo = personArg.split("=");
            String name = personInfo[0];
            int money = Integer.parseInt(personInfo[1]);


            try {
                Person person = new Person(name, money);
                people.put(name, person);

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }
        Map<String, Product> products = new HashMap<>();
        String[] productArgs = reader.readLine().split(";");
        for (String productArg : productArgs) {
            String[] productInfo = productArg.split("=");
            String name = productInfo[0];
            int cost = Integer.parseInt(productInfo[1]);

            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        String purchase;
        while (!"END".equals(purchase = reader.readLine())) {
            String[] purchaseArgs = purchase.split(" ");
            String personName = purchaseArgs[0];
            String productName = purchaseArgs[1];
            Person person = people.get(personName);
            Product product = products.get(productName);

            try {
                person.tryPurchase(product);
                System.out.println(personName + " bought " + productName);
            } catch (IllegalStateException ise) {
                System.out.println(ise.getMessage());
            }
        }

        people.values().forEach(System.out::println);
    }
}
