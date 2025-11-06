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
        brokerObservable.setDownJones(oldMarketValue);
        brokerObservable.setDownJones(getRandomValue());

        System.out.println("Changing Down Jones");
        System.out.println("Old market value: " + oldMarketValue);
        System.out.println("Agency 1 New market value: " + agency1.getDownJonesValue());
        System.out.println("Agency 2 New market value: " + agency2.getDownJonesValue());
        System.out.println("Agency 3 New market value: " + agency2.getDownJonesValue());
        System.out.println("Removing Agency 1");
        brokerObservable.removePropertyChangeListener(agency1);
        brokerObservable.setDownJones(getRandomValue());
        System.out.println("Agency 1 New market value: " + agency1.getDownJonesValue());
        System.out.println("Agency 2 New market value: " + agency2.getDownJonesValue());
        System.out.println("Agency 3 New market value: " + agency2.getDownJonesValue());


        System.out.println("Changing Ibex35");
        oldMarketValue = getRandomValue();
        brokerObservable.setibex35(oldMarketValue);
        System.out.println("Agency 1 Old value: " + agency1.getIbex35Value());
        System.out.println("Agency 2 Old value: " + agency2.getIbex35Value());
        System.out.println("Agency 3 Old value: " + agency2.getIbex35Value());
        brokerObservable.setibex35(getRandomValue());
        System.out.println("Agency 1 New market value: " + agency1.getIbex35Value());
        System.out.println("Agency 2 New market value: " + agency2.getIbex35Value());
        System.out.println("Agency 3 New market value: " + agency2.getIbex35Value());
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 101);
    }
}
