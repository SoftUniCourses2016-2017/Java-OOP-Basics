package speedRacing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int carsNumber = Integer.parseInt(reader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < carsNumber; i++) {
            String[] input = reader.readLine().split(" ");

            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCostPerKm = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKm);
            cars.put(car.getModel(), car);
        }

        String command;
        while (!"End".equals(command = reader.readLine())){
            String[] commandArgs = command.split(" ");
            String model = commandArgs[1];
            int distance = Integer.parseInt(commandArgs[2]);

            Car car = cars.get(model);
            car.drive(distance);
        }

        cars.values().forEach(System.out::println);
    }
}
