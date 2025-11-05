package exercise1.builders;

import exercise1.builders.enums.PizzaDough;
import exercise1.builders.enums.PizzaSize;
import exercise1.builders.enums.PizzaType;

import java.util.ArrayList;

public class PizzaMargherita extends PizzaBuilder {

    protected PizzaType type;
    protected PizzaSize size;
    protected PizzaDough dough;
    protected ArrayList<String> toppings = new ArrayList<>();

    public PizzaType getType() {
        return type;
    }

    public void setType() {
        this.type = PizzaType.MARGARITTA;
    }

    public PizzaSize getSize() {
        return size;
    }

    @Override
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public PizzaDough getDough() {
        return dough;
    }

    @Override
    public void setDough(PizzaDough dough) {
        this.dough = dough;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(String topping) {
        this.toppings.add(topping);
    }

    public Pizza getResult() {
        return new Pizza(type, size, dough, toppings);
    }

    @Override
    public String toString() {
        return "PizzaMargherita{" +
                "type=" + type +
                ", size=" + size +
                ", dough=" + dough +
                ", toppings=" + toppings +
                '}';
    }
}
