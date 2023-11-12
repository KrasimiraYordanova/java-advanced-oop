package PizzaEnum;

import java.util.Arrays;

public class Dough {
    private String flourType;
    private BakingTechnique bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200]");
        }
        this.weight = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        // whether the baking technique exist inside our bakingTechnique Enum
        boolean bakingTechniqueNotExist = Arrays.stream(BakingTechnique.values()).noneMatch((bakeTechnique -> bakeTechnique.name().equals(bakingTechnique)));
        if(bakingTechniqueNotExist) {
            throw new IllegalArgumentException("Invalid type of dough");
        }
        this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White":
            case "Wholegrain":
                this.flourType = flourType;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough");
        }
    }

    public double calculateCalories() {
        return 2 * weight * getModifierFlour() * bakingTechnique.getModifier();
    }

    public double getModifierFlour() {
        switch (flourType) {
            case "White": return 1.5;
            case "Wholegrain": return 1.0;
            default: return 0;
        }
    }
}
