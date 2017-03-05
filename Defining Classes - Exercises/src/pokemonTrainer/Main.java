package pokemonTrainer;

import pokemonTrainer.Trainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Magdalena on 1.3.2017 г..
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Trainer> trainers = new LinkedHashMap<>();
        String commands;

        while (!"Tournament".equals(commands = reader.readLine())) {
            String[] input = commands.split(" ");
            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            Trainer trainer = trainers.get(trainerName);
            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            trainer.getPokemons().add(pokemon);
        }
        while ((!"End".equals(commands = reader.readLine()))) {
            for (Trainer trainer : trainers.values()) {
                String type = commands;
                long elementCount = trainer.getPokemons().stream().filter(pokemon -> type.equals(pokemon.getElement())).count();
                if (elementCount > 0){
                    trainer.setNumberOfBadges(trainer.getNumberOfBadges() + 1);
                }
                else{
                    trainer.getPokemons()
                            .forEach(pokemon -> pokemon.setHealth(pokemon.getHealth() - 10));
                    trainer.setPokemons(trainer.getPokemons().stream()
                    .filter(pokemon -> pokemon.getHealth() > 0)
                    .collect(Collectors.toSet()));
                }
            }
        }

        trainers.values().stream()
                .sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                .forEach(System.out::println);


    }
}
