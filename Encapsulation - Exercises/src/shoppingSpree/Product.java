package shoppingSpree;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost){
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }

    private void setName(String name){
        if (name.length() < 1 || name.charAt(0) == ' '){
            throw  new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(int cost){
        if (cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    @Override
    public String toString(){
        return this.getName();
    }


}
