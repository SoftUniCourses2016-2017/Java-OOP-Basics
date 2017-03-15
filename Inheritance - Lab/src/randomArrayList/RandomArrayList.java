package randomArrayList;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Magdalena on 16.3.2017 г..
 */
public class RandomArrayList extends ArrayList{
    private Random rnd;

    public RandomArrayList(){
        rnd = new Random();
    }

    public Object getRandomElement(){
        int index = rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.get(super.size() - 1));
        super.remove(super.size() - 1);

        return element;
    }

}
