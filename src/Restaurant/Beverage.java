package Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {

    private double mililiter;

    public Beverage(String name, BigDecimal price, double mililiter) {
        super(name, price);
        this.mililiter = mililiter;
    }

    public double getMililiter() {
        return mililiter;
    }
}
