package pizzaCalories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Pizza {

    private String name;
    private Dough dough;
   private List<Topping> toppings;

   public Pizza(String name){
       this.setName(name);
       this.toppings = new ArrayList<>();
   }

    private String getName() {
        return this.name;
    }

    public Dough getDough() {
        return this.dough;
    }

    private List<Topping> getToppings() {
       return Collections.unmodifiableList(this.toppings);
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    private void setName(String name) {
        if (name == null || name.trim().length() == 0 || name.length() > 15){
            throw new IllegalArgumentException("Pizza name shpuld be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private double getTotalCalories() {
        return this.getDough().getCaloriesPerGramDough() + this.getTotalToppingCalories();
    }

    public void addToppings(Topping topping){
        this.toppings.add(topping);
    }

    public int getNumberOfToppings(){
        int toppings = this.getToppings().size();
        if (10 < toppings){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        return toppings;
    }

    private double getTotalToppingCalories(){
        return getToppings().stream().mapToDouble(Topping::getCalories).sum();
    }

    @Override
    public String toString(){
        return String.format("%s - %.2f", this.getName(), this.getTotalCalories());
    }
}
