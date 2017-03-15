package stackOfStrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magdalena on 16.3.2017 г..
 */
public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        return this.data.remove(this.data.size() - 1);
    }


}
