package exercise3;

import exercise3.gateway.PaymentsGateway;
import exercise3.paymenthsMethods.BankAccount;
import exercise3.paymenthsMethods.CreditCard;
import exercise3.paymenthsMethods.PaymentMethod;
import exercise3.paymenthsMethods.Paypal;

public class ShoesShop {
    public static void main(String[] args) {
        PaymentsGateway gateway = new PaymentsGateway();
        PaymentMethod method1 = new CreditCard("1234-5678-9012-3456");
        PaymentMethod method2 = new Paypal("email@exemple.com");
        PaymentMethod method3 = new BankAccount("ES12 3456 7890 1234 5678 9012");

        gateway.processPayment(300.0, method1);
        gateway.processPayment(300.0, method2);

        gateway.processPayment(300.0, method3);

    }
}

