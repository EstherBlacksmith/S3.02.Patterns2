package exercise3.paymenthsMethods;

import exercise3.gateway.PaymentsCallback;

import java.util.Objects;

public class Paypal implements PaymentsCallback {
    private String email = "";

    public Paypal(String email) {
        this.email = Objects.requireNonNull(email);
    }


    @Override
    public void pay(Double amount) {
        System.out.println("Sending Paypal payment. Email: " + email);
    }
}
