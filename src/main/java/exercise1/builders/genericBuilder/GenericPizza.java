package exercise1.builders.genericBuilder;

import exercise1.builders.enums.PizzaDough;
import exercise1.builders.enums.PizzaSize;
import exercise1.builders.enums.PizzaType;

import java.util.ArrayList;

public class GenericPizza {
    protected ArrayList<String> toppings = new ArrayList<>();
    private PizzaDough PizzaDough;
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;

    public PizzaDough getPizzaDough() {
        return PizzaDough;
    }

    public void setPizzaDough(PizzaDough pizzaDough) {
        PizzaDough = pizzaDough;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "GenericPizza{" +
                "PizzaDough=" + PizzaDough +
                ", pizzaSize=" + pizzaSize +
                ", pizzaType=" + pizzaType +
                ", toppings=" + toppings +
                '}';
    }
}
