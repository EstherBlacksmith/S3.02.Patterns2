package exercise1.builders;

import exercise1.builders.enums.PizzaDough;
import exercise1.builders.enums.PizzaSize;
import exercise1.builders.enums.PizzaType;
import exercise1.builders.genericBuilder.GenericBuilder;
import exercise1.builders.genericBuilder.GenericPizza;

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
        System.out.println(pizzaMargherita);

        GenericPizza pizza2 = GenericBuilder.of(GenericPizza::new)
                .with(GenericPizza::setPizzaType, PizzaType.CARBONARA)
                .with(GenericPizza::setPizzaDough, PizzaDough.SOTTILE)
                .with(GenericPizza::setPizzaSize, PizzaSize.FAMILIAR)
                .with(GenericPizza::setToppings, "Mozzarella")
                .with(GenericPizza::setToppings, "Carbonara")
                .with(GenericPizza::setToppings, "Pepe nero")
                .build();

        System.out.println(pizza2);


    }
}
