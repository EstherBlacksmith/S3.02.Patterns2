import java.util.ArrayList;

public class PizzaBuilder implements Builder{
    private PizzaType type;
    private String size;
    private String dough;
    private ArrayList<String> toppings;

    @Override
    public void setPizzaType(PizzaType type) {
        this.type = type;
    }


    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setDough(String dough) {
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

