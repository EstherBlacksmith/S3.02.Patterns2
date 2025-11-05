import java.util.ArrayList;

public interface Builder {
    void setPizzaType(PizzaType type);
    void setSize(String size);
    void setDough(String dough);
    void addToppings(String topping);

}
