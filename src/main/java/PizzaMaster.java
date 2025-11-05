public class PizzaMaster {

    public void PizzaGranapadano(Builder builder) {
        builder.setDough("Sottile");
        builder.setSize("Familiar");
        builder.addToppings("Pomodoro");
        builder.addToppings("Grana Padano");
        builder.addToppings("Rucula");
        builder.addToppings("Parmigiano");
    }


    public void PizzaBiancha(Builder builder) {
        builder.setDough("Denso");
        builder.setSize("Familiar");
        builder.addToppings("Mozzarella");
        builder.addToppings("Mortadella");
    }

}
