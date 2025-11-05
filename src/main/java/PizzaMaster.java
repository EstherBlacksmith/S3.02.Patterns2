public class PizzaMaster {

    public void PizzaGranapadano(Builder builder) {
        builder.setPizzaType(PizzaType.GRANAPADANO);
        builder.setDough("Bordo Ripieno di Formaggio");
        builder.setSize(PizzaSize.INDIVIDUAL);
        builder.addToppings("Pomodoro");
        builder.addToppings("Grana Padano");
        builder.addToppings("Rucula");
        builder.addToppings("Parmigiano");
        builder.addToppings("Olive nere");
    }


    public void PizzaBiancha(Builder builder) {
        builder.setPizzaType(PizzaType.BIANCA);
        builder.setDough("Denso");
        builder.setSize(PizzaSize.FAMILIAR);
        builder.addToppings("Mozzarella");
        builder.addToppings("Mortadella");
    }

    public void PizzaDiavola(Builder builder) {
        builder.setPizzaType(PizzaType.DIAVOLA);
        builder.setDough("Sottile");
        builder.setSize(PizzaSize.FAMILIAR);
        builder.addToppings("Mozzarella");
        builder.addToppings("Mortadella");
        builder.addToppings("Olio picante");
        builder.addToppings("Salsiccia piccante");

    }

}
