package exercise1.classicBuilder;

import exercise1.enums.PizzaDough;
import exercise1.enums.PizzaSize;
import exercise1.enums.PizzaType;

import java.util.ArrayList;

public final class Pizza {
    private final PizzaSize size;
    private final PizzaDough dough;
    private final ArrayList<String> toppings;
    private final PizzaType type;

    public Pizza(PizzaType type, PizzaSize size, PizzaDough dough, ArrayList<String> toppings) {
        this.type = type;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaDough getDough() {
        return dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public PizzaType getType() {
        return type;
    }
}


