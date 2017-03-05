package catLady;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Cymric extends Cat{

    private double furLength;

    public Cymric(String name, double furLength){
        super(name, "Cymric");
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", super.getType(), super.getName(), this.furLength);
    }
}
