public class Main {
    public static void main(String[] args) {
        PizzaMarguerita pizzaMarguerita = new PizzaMarguerita();
       // pizzaMarguerita.cooking();
        pizzaMarguerita.setDough("Fina");
        pizzaMarguerita.setSize("Individual");
        pizzaMarguerita.addToppings("Mozzarella");
        pizzaMarguerita.addToppings("Tomato");


        System.out.println( pizzaMarguerita.toString());
      //  PizzaMaster pizzaMaster = new PizzaMaster();

      //  pizzaMaster.makePizza();
    }
}
