import java.util.ArrayList;

public interface Builder {

    String size = "";
    String dough = "";
    ArrayList<String> toppings = null;

    Builder setSize(String size);

    Builder setDough(String dough);

    Builder addToppings(String topping);

}
