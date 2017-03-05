package speedRacing;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Car {
    private static final int INITIAL_DISTANCE_TRAVELLED = 0;

    private String model;


    private double fuelAmount;
    private double fuelForOneKm;
    private int distanceTraveled = INITIAL_DISTANCE_TRAVELLED;


    public Car(String model, double fuelAmount, double fuelForOneKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelForOneKm = fuelForOneKm;
    }

    public void drive(int distance) {
        double neededFuel = distance * this.fuelForOneKm;

        if (neededFuel > this.fuelAmount) {
            System.out.println("Insufficient fuel for the drive");
            return;
        }

        this.setFuel(this.getFuel() - neededFuel);
        this.setDistanceTravelled(this.getDistanceTraveled() + distance);
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuelAmount;
    }

    public void setFuel(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getDistanceTraveled(){
        return distanceTraveled;
    }

    public void setDistanceTravelled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %s", this.model, this.fuelAmount, this.distanceTraveled);
    }
}

