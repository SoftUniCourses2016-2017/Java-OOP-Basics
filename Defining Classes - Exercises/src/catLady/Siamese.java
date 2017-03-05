package catLady;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Siamese extends Cat{

    private int earSize;

    public Siamese(String name, int earSize){
        super(name, "Siamese");
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", super.getType(), super.getType(), this.earSize);
    }
}
