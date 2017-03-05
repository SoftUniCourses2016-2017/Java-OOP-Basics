package rawData;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Tire {
    private int age;
    private double pressure;

    public Tire(int age, double pressure){
        this.age = age;
        this.pressure = pressure;
    }

    public double getPressure() {
        return pressure;
    }
}
