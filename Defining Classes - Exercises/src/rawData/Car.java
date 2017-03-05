package rawData;

import java.util.List;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tire> tires){
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public String getModel() {
        return model;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return this.getModel();
    }
}
