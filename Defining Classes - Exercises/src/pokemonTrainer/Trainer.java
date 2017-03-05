package pokemonTrainer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Magdalena on 1.3.2017 г..
 */
public class Trainer {
    private static final int DEFAULT_BADGES = 0;

    private String name;
    private int numberOfBadges = DEFAULT_BADGES;
    private Set<Pokemon> pokemons;

    public Trainer(String name){
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemons = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }
    public Set<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.getName(), this.getNumberOfBadges(), this.getPokemons().size());
    }


}
