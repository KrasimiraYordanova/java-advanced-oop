package Pizza;

public class Dough {
    private String flourType;
    private String bakingTechnique;
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
        switch (bakingTechnique) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.bakingTechnique = bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough");
        }
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
        return 2 * weight * getModifierFlour() * getModifierBakingTechnique();
    }

    public double getModifierFlour() {
        switch (flourType) {
            case "White": return 1.5;
            case "Wholegrain": return 1.0;
            default: return 0;
        }
    }

    public double getModifierBakingTechnique() {
        switch (bakingTechnique) {
            case "Crispy": return 0.9;
            case "Chewy": return 1.1;
            case "Homemade": return 1.0;
            default: return 0;
        }
    }
}
