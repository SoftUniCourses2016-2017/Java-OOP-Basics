package randomArrayList;

/**
 * Created by Magdalena on 16.3.2017 г..
 */
public class Main {
    public static void main(String[] args) {
        RandomArrayList ral = new RandomArrayList();

        ral.add(1);
        ral.add("gosho");
        ral.add(2);

        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
    }
}
