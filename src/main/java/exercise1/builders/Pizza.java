package exercise1.builders;

import exercise1.builders.enums.PizzaDough;
import exercise1.builders.enums.PizzaSize;
import exercise1.builders.enums.PizzaType;

import java.util.ArrayList;

final class Pizza {
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


