package exercise3.paymenthsMethods;

import java.util.Objects;

public class Paypal implements PaymentMethod {
    private String email = "";

    public Paypal(String email) {
        this.email = Objects.requireNonNull(email);
    }


    @Override
    public void onPaymentGateway(double amount) {
        System.out.println("Sending Paypal payment. Email: " + email);
    }
}
