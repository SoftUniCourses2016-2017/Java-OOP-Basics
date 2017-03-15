package pizzaCalories;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Dough {
    private static final double DEFAULT_DOUGH_MODIFIER = 2.0;

    private String flourType;
    private String bakingTechnique;
    private Double weight;

    public Dough(String flourType, String bakingTechnique, Double weight){
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private String getBakingTechnique() {
        return bakingTechnique;
    }

    private String getFlourType() {
        return flourType;
    }

   private double getWeight() {
        return weight;
    }

    private Double getTypeModifier() {
        String type = this.getFlourType().toLowerCase();
        switch (type) {
            case "white":
                return 1.5;
            case "wholegrain":
                return 1.0;
            default:
                return null;
        }
    }

    private Double getTechniqueModifier() {
        String technique = this.getBakingTechnique().toLowerCase();
        switch (technique) {
            case "crispy":
                return 0.9;
            case "chewy":
                return 1.1;
            case "homemade":
                return 1.0;
            default:
                return null;
        }
    }

    private void setFlourType(String floorType) {
        if (floorType == null || (!"white".equals(floorType.toLowerCase()) && !"wholegrain".equals(floorType.toLowerCase()))){
throw new IllegalArgumentException("Invalid type of dough.");
            }
        this.flourType = floorType;
    }

    private void setBakingTechnique(String bakingTechnique){
        if (bakingTechnique == null || (!"crispy".equals(bakingTechnique.toLowerCase()) && !"chewy".equals(bakingTechnique.toLowerCase())
        && !"homemade".equals(bakingTechnique.toLowerCase()))){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public Double getCaloriesPerGramDough() {
        return DEFAULT_DOUGH_MODIFIER * this.getWeight() * this.getTypeModifier() * this.getTechniqueModifier();
    }


}
