package exercise3.paymenthsMethods;

import exercise3.gateway.PaymentsCallback;

import java.util.Objects;

public class CreditCard implements PaymentsCallback {
    private String cardNumber = "";

    public CreditCard(String cardNumber) {
        this.cardNumber = Objects.requireNonNull(cardNumber);

    }

    @Override
    public void pay(Double amount) {
        System.out.println("Sending Credit Card payment. Card number: " + cardNumber);

    }
}
