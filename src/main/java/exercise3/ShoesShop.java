package exercise3;

import exercise3.gateway.PaymentsGateway;
import exercise3.paymenthsMethods.BankAccount;
import exercise3.paymenthsMethods.CreditCard;
import exercise3.paymenthsMethods.Paypal;

public class ShoesShop {
    public static void main(String[] args) {
        PaymentsGateway gateway = new PaymentsGateway();

        CreditCard creditCard = new CreditCard("1234-5678-9012-3456");
        Paypal paypal = new Paypal("email@exemple.com");
        BankAccount bankAccount = new BankAccount("ES12 3456 7890 1234 5678 9012");

        gateway.processPayment(79.99, paypal);
        gateway.processPayment(100.50, creditCard);
        gateway.processPayment(675.99, bankAccount);

    }
}

