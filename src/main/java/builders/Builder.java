package builders;

import enums.PizzaDough;
import enums.PizzaSize;
import enums.PizzaType;

public interface Builder {
    void setPizzaType(PizzaType type);

    void setSize(PizzaSize size);

    void setDough(PizzaDough dough);

    void addToppings(String topping);

}
