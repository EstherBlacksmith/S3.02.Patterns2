import java.util.ArrayList;

public class PizzaMarguerita implements Builder {
    ArrayList<String> toppings;
    private Pizza pizza;

    public PizzaMarguerita() {
        this.cooking();
    }

    void cooking() {
        this.pizza = new Pizza(this);
    }

    @Override
    public Builder setSize(String size) {
        return this;
    }

    @Override
    public Builder setDough(String dough) {
        return this;
    }

    @Override
    public Builder addToppings(String topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public String toString() {
        return "PizzaMarguerita" +
                "toppings=" + toppings +
                ", pizza=" + pizza ;
    }
}

