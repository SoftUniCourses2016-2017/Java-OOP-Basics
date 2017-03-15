package pizzaCalories;

/**
 * Created by Magdalena on 10.3.2017 г..
 */
public class Topping {
    private static final double DEFAULT_DOUGH_MODIFIER = 2.0;
  private String type;
  private Double weight;

  public Topping(String type, double weight){
      this.setType(type);
      this.setWeight(weight);
  }

    private String getType() {
        return this.type;
    }

    private Double getWeight() {
        return this.weight;
    }

    private Double getTypeModifier(){
      String type = this.getType().toLowerCase();
      switch (type){
          case "meat":
              return 1.2;
          case "veggies":
              return 0.8;
          case "cheese":
              return 1.1;
          case "sauce":
              return 0.9;
          default:
              return null;
      }
  }



    private void setType(String type) {
       if (type == null || (!"meat".equals(type.toLowerCase()) && (!"veggies".equals(type.toLowerCase()) && (!"cheese".equals(type.toLowerCase())
       && (!"sauce".equals(type.toLowerCase())))))){
           throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", type));
        }
        this.type = type;
    }

   private void setWeight(double weight) {
       if (weight < 1 || weight > 50){
           throw new IllegalArgumentException(this.getType() + " weight should be in the range [1..50].");
       }
       this.weight = weight;
    }

    public double getCalories() {
        return DEFAULT_DOUGH_MODIFIER * this.getWeight() * this.getTypeModifier();
    }
}
