package exercise3.paymenthsMethods;

import java.util.Objects;

public class CreditCard implements PaymentMethod {
    private String cardNumber = "";

    public CreditCard(String cardNumber) {
        this.cardNumber = Objects.requireNonNull(cardNumber);

    }

    @Override
    public void onPaymentGateway(double amount) {
        System.out.println("Sending Credit Card payment. Card number: " + cardNumber);
    }
}
