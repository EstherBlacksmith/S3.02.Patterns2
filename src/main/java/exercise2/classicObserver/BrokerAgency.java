package exercise2.classicObserver;

import java.util.ArrayList;
import java.util.List;

public class BrokerAgency {
    private final List<Broker> brokers = new ArrayList<>();
    private int marketValue;

    public void addObserver(Broker broker) {
        this.brokers.add(broker);
    }

    public void removeObserver(Broker broker) {
        this.brokers.remove(broker);
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
        for (Broker broker : this.brokers) {
            broker.update(this.marketValue);
        }
    }

    public void getBrokers() {

        for (Broker broker : brokers) {
            System.out.println(broker.toString());
        }
    }

    public List<Broker> getBrokersList() {
        return this.brokers;
    }

}
