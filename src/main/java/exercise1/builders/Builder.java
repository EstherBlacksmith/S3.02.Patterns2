package exercise1.builders;

import exercise1.builders.enums.PizzaDough;
import exercise1.builders.enums.PizzaSize;
import exercise1.builders.enums.PizzaType;

public interface Builder {
    void setPizzaType(PizzaType type);

    void setSize(PizzaSize size);

    void setDough(PizzaDough dough);

    void addToppings(String topping);

}
