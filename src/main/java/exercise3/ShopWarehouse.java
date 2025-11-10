package exercise3;

public class ShopWarehouse {
    private Payments payments;

    public ShopWarehouse() {
    }

    public void AsynchronousEventConsumer(Payments payments) {
        this.payments = payments;
    }

    public void doAsynchronousOperation(){
        System.out.println("Performing operation in Asynchronous Task");

        new Thread(() -> payments.onTrigger()).start();
    }
}
