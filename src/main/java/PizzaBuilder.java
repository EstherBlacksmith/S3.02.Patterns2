import builders.Builder;
import enums.PizzaDough;
import enums.PizzaSize;
import enums.PizzaType;

import java.util.ArrayList;

public class PizzaBuilder implements Builder {
    private PizzaType type;
    private PizzaSize size;
    private PizzaDough dough;
    private ArrayList<String> toppings = new ArrayList<>();

    @Override
    public void setPizzaType(PizzaType type) {
        this.type = type;
    }


    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public void setDough(PizzaDough dough) {
        this.dough = dough;
    }

    @Override
    public void addToppings(String topping) {
        this.toppings.add(topping);
    }

    public Pizza getResult() {
        return new Pizza(type, size, dough, toppings);
    }
}

