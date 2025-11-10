package exercise3;

public class Shopping implements Payments {
    @Override
    public String onTrigger(){
        respondToTrigger();
        return "A pair of shoes has been added to the cart";
    }
    @Override
    public void respondToTrigger(){
        System.out.println("The costumer passed the payment gateway");
    }
}
