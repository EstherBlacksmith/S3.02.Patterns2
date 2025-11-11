package exercise3.gateway;

import exercise3.paymenthsMethods.PaymentMethod;

public class PaymentsGateway {
    public void processPayment(double callback, PaymentMethod method1) {
        System.out.println("Client has been redirected to the payments gateway");

        method1.onPaymentGateway(callback);
        System.out.println("The payment has been completed");
    }

}
