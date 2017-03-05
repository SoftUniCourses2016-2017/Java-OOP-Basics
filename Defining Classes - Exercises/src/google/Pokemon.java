package google;

/**
 * Created by Magdalena on 1.3.2017 г..
 */
public class Pokemon {
    private String name;
    private String type;

    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString(){
        return this.name + " " + this.type;
    }
}
