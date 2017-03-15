package fragileBaseClass;

import java.util.Collections;

/**
 * Created by Magdalena on 15.3.2017 г..
 */
public class Predator extends Animal {

    private int health;

    public void feed(Food food) {
        super.eat(food);
        this.health++;
    }

    public void feedAll(Food[] foods){
        Collections.addAll(super.foodEaten, foods);
        this.health += foods.length;
    }
}
