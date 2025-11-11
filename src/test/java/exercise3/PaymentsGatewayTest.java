package exercise3;

import exercise3.gateway.PaymentsCallback;
import exercise3.gateway.PaymentsGateway;
import exercise3.paymenthsMethods.BankAccount;
import exercise3.paymenthsMethods.CreditCard;
import exercise3.paymenthsMethods.Paypal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PaymentsGatewayTest {


    @Test
    @DisplayName("Test return expected string using fake implementation")
    void testProcessPaymentWithFake() {
        PaymentsGateway gateway = new PaymentsGateway();
        PaymentsCallbackFake callback = new PaymentsCallbackFake();

        gateway.processPayment(79.99, callback);

        assertTrue(callback.called);
        assertEquals(79.99, callback.amountPaid);
    }

    @Test
    void testReturnsExpectedStringBankAccount() {
        BankAccount bankAccount = new BankAccount("ES12 3456 7890 1234 5678 9012");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        bankAccount.pay(100.0);

        String result = output.toString().trim();

        assertTrue(result.contains("Sending SEPA order"));
        assertTrue(result.contains("ES12 3456 7890 1234 5678 9012"));
    }

    @Test
    void testReturnsExpectedStringPaypal() {
        Paypal paypal = new Paypal("email@example.com");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        paypal.pay(200.0);

        String result = output.toString().trim();

        assertTrue(result.contains("Sending Paypal payment"));
        assertTrue(result.contains("email@example.com"));
    }

    @Test
    void testReturnsExpectedStringCreditCard() {
        CreditCard creditCard = new CreditCard("1234-5678-9012-3456");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        creditCard.pay(300.0);

        String result = output.toString().trim();

        assertTrue(result.contains("Sending Credit Card payment"));
        assertTrue(result.contains("1234-5678-9012-3456"));
    }

    static class PaymentsCallbackFake implements PaymentsCallback {
        boolean called = false;
        double amountPaid = 0;

        @Override
        public void pay(Double amount) {
            called = true;
            amountPaid = amount;
        }
    }
}