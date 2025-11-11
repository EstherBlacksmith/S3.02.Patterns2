package exercise2.classicObserver;

public class Main {
    public static void main(String[] args) {
        BrokerAgency brokerAgency = new BrokerAgency();
        Broker brokerObserver = new Broker();

        brokerAgency.addObserver(brokerObserver);
        brokerAgency.getBrokers();

        int oldValue = getRandomValue();
        brokerAgency.setMarketValue(oldValue);
        System.out.println("Old value: " + oldValue);
        System.out.println("Broker observer: " + brokerObserver.getMarketValue());
        System.out.println("Changing the value");
        brokerAgency.setMarketValue(getRandomValue());
        System.out.println("Broker observer: " + brokerObserver.getMarketValue());
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 101);
    }
}
