package exercise3.paymenthsMethods;

import exercise3.gateway.PaymentsCallback;

import java.util.Objects;

public class BankAccount implements PaymentsCallback {

    private String accountNumber = "";

    public BankAccount(String accountNumber) {
        this.accountNumber = Objects.requireNonNull(accountNumber);
    }


    @Override
    public void pay(Double amount) {
        System.out.println("Sending SEPA order. Bank account: " + accountNumber);
    }
}
