package exercise3.paymenthsMethods;

import java.util.Objects;

public class BankAccount implements PaymentMethod {

    private String accountNumber = "";

    public BankAccount(String accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber);
    }


    @Override
    public void onPaymentGateway(double amount) {
        System.out.println("Sending SEPA order. Bank account: " + accountNumber);
    }
}
