package catLady;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Magdalena on 5.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Cat> cats = new HashMap<>();

        String input;
        while (!"End".equals(input = reader.readLine())) {
            String[] catInfo = input.split(" ");
            Cat cat = null;
            String type = catInfo[0];
            String name = catInfo[1];

            switch (type) {
                case "StreetExtraordinaire":
                    int decibelsOfMeows = Integer.parseInt(catInfo[2]);
                    cat = new StreetExtraordinaire(name, decibelsOfMeows);
                    break;
                case "Siamese":
                    int earSize = Integer.parseInt(catInfo[2]);
                    cat = new Siamese(name, earSize);
                    break;
                case "Cymric":
                    double furLength = Double.parseDouble(catInfo[2]);
                    cat = new Cymric(name, furLength);
                    break;
            }

            cats.put(name, cat);
        }
        String catToPrint = reader.readLine();
        System.out.println(cats.get(catToPrint));

    }
}
