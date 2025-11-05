package exercise1.classicBuilder;

import exercise1.enums.PizzaDough;
import exercise1.enums.PizzaSize;
import exercise1.enums.PizzaType;

public interface Builder {
    void setPizzaType(PizzaType type);

    void setSize(PizzaSize size);

    void setDough(PizzaDough dough);

    void addToppings(String topping);

}
