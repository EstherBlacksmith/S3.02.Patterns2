package exercise3.gateway;

public class PaymentsGateway {

    public void processPayment(double amount, PaymentsCallback method) {
        System.out.println("Opening the gateway");
        method.pay(amount);
        System.out.println("Finishing the payment");
    }

}
