package catLady;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class StreetExtraordinaire extends Cat {
    private int decibelsOfMeows;

    public StreetExtraordinaire(String name, int decibelsOfMeows){
      super(name, "StreetExtraordinaire");
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", super.getType(), super.getName(), this.decibelsOfMeows);
    }
}
