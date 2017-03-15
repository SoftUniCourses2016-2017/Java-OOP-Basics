package classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double length = Double.parseDouble(reader.readLine());
        double width = Double.parseDouble(reader.readLine());
        double height = Double.parseDouble(reader.readLine());

        Box box = null;

        try {
            box = new Box(length, width, height);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            return;
        }

        System.out.println(String.format("Surface Area - %.2f", box.getSurfaceArea()));
        System.out.println(String.format("Lateral Surface Area - %.2f", box.getLateralSurfaceArea()));
        System.out.println(String.format("Volume - %.2f", box.getVolume()));
    }
}
