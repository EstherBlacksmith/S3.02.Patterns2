import builders.PizzaMaster;
import enums.PizzaDough;
import enums.PizzaSize;

public class Main {
    public static void main(String[] args) {
        PizzaMaster chef = new PizzaMaster();

        PizzaBuilder builder = new PizzaBuilder();
        chef.PizzaBiancha(builder);

        Pizza pizza = builder.getResult();
        System.out.println("Pizza al forno :\n" + pizza.getType());

        PizzaMargherita pizzaMargherita = new PizzaMargherita();
        pizzaMargherita.setType();
        pizzaMargherita.setSize(PizzaSize.INDIVIDUAL);
        pizzaMargherita.setDough(PizzaDough.BORDO_RIPIENO_DI_FORMAGIO);
        pizzaMargherita.setToppings("Pomodoro");
        pizzaMargherita.setToppings("Mozzarella");
        System.out.println( pizzaMargherita.toString());
    }
}
