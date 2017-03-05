package rawData;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Cargo {
    private String type;
    private int weight;

    public Cargo(String type, int weight){
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }
}
