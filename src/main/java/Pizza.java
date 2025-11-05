import java.util.ArrayList;

final class Pizza {
    private final String size;
    private final String dough;
    private final ArrayList<String> toppings;
    private final PizzaType type;

    public Pizza(PizzaType type, String size, String dough, ArrayList<String> toppings) {
        this.type = type;
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public PizzaType getType() {
        return type;
    }
}


