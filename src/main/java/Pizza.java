import java.util.ArrayList;

final class Pizza {
    private final String size;
    private final String dough;
    private final ArrayList<String> toppings;

    Pizza(PizzaMarguerita builder) {
        this.size = Builder.size;
        this.dough = Builder.dough;
        this.toppings = Builder.toppings;
    }

}
