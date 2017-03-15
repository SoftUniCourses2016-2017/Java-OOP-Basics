package shoppingSpree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Person {
    private String name;
    private int money;
    private List<Product> products;

    public Person(String name, int money){
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name){
        if (name == null || name.trim().length() == 0){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(int money){
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(this.products);
    }

    private void addProduct(Product product){
        this.products.add(product);
    }

    public void tryPurchase(Product product){
        if (this.getMoney() >= product.getCost()){
            this.setMoney((int) (this.getMoney() - product.getCost()));
            this.addProduct(product);
        }else{
            throw new IllegalStateException(String.format("%s can't afford %s", this.getName(), product.getName()));
        }
    }

    @Override
    public String toString(){
        if (this.getProducts().size() == 0){
            return this.getName() + " - Nothing bought";
        }
        return this.getName() + " - " + String.join(", ", this.getProducts().stream().map(Objects::toString).collect(Collectors.toList()));
    }

}
