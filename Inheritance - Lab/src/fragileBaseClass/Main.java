package fragileBaseClass;

/**
 * Created by Magdalena on 15.3.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator();
        predator.feedAll(new Food[] { new Food(), new Food() });
        predator.feed(new Food());
        System.out.println();
    }
}
