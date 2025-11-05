package builders;

import enums.PizzaDough;
import enums.PizzaSize;
import enums.PizzaType;

public class PizzaMaster {

    public void PizzaGranapadano(Builder builder) {
        builder.setPizzaType(PizzaType.GRANAPADANO);
        builder.setDough(PizzaDough.BORDO_RIPIENO_DI_FORMAGIO);
        builder.setSize(PizzaSize.INDIVIDUAL);
        builder.addToppings("Pomodoro");
        builder.addToppings("Grana Padano");
        builder.addToppings("Rucula");
        builder.addToppings("Parmigiano");
        builder.addToppings("Olive nere");
    }


    public void PizzaBiancha(Builder builder) {
        builder.setPizzaType(PizzaType.BIANCA);
        builder.setDough(PizzaDough.DENSO);
        builder.setSize(PizzaSize.FAMILIAR);
        builder.addToppings("Mozzarella");
        builder.addToppings("Mortadella");
    }

    public void PizzaDiavola(Builder builder) {
        builder.setPizzaType(PizzaType.DIAVOLA);
        builder.setDough(PizzaDough.SOTTILE);
        builder.setSize(PizzaSize.FAMILIAR);
        builder.addToppings("Mozzarella");
        builder.addToppings("Mortadella");
        builder.addToppings("Olio picante");
        builder.addToppings("Salsiccia piccante");
    }

}
