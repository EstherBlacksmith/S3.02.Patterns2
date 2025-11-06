package exercise2;

public class Main {
    public static void main(String[] args) {
        BrokerObservable brokerObservable = new BrokerObservable();
        BrokerAgency agency1 = new BrokerAgency();
        BrokerAgency agency2 = new BrokerAgency();
        BrokerAgency agency3 = new BrokerAgency();
        brokerObservable.addPropertyChangeListener(agency1);
        brokerObservable.addPropertyChangeListener(agency2);
        brokerObservable.addPropertyChangeListener(agency3);

        int oldMarketValue = getRandomValue();

        brokerObservable.setMarketValue(oldMarketValue);
        brokerObservable.setMarketValue(getRandomValue());

        System.out.println("Old market value: " + oldMarketValue);
        System.out.println("Agency 1 New market value: " + agency1.getMarketValue());
        System.out.println("Agency 2 New market value: " + agency2.getMarketValue());
        System.out.println("Agency 3 New market value: " + agency2.getMarketValue());
        System.out.println("Removing Agency 1");
        brokerObservable.removePropertyChangeListener(agency1);
        brokerObservable.setMarketValue(getRandomValue());
        System.out.println("Agency 1 New market value: " + agency1.getMarketValue());
        System.out.println("Agency 2 New market value: " + agency2.getMarketValue());
        System.out.println("Agency 3 New market value: " + agency2.getMarketValue());


    }

    private static int getRandomValue() {
        return (int) (Math.random() * 101);
    }
}
