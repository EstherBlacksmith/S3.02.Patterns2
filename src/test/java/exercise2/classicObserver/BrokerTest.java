package exercise2.classicObserver;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BrokerTest {

    @Test
    void update() {
    }

    @Test
    void testBrokerIsUpdatedWhenSubjectChanges() {
        BrokerAgency brokerAgency = new BrokerAgency();

        Broker brokerObserver1 = new Broker();
        Broker brokerObserver2 = new Broker();

        brokerAgency.addObserver(brokerObserver1);
        brokerAgency.addObserver(brokerObserver2);

        brokerAgency.getBrokers();

        int oldValue = 5;
        brokerAgency.setMarketValue(oldValue);

        assert (oldValue == brokerObserver1.getMarketValue());
        assert (oldValue == brokerObserver2.getMarketValue());

        int newValue = 10;
        brokerAgency.setMarketValue(newValue);
        assert (newValue == brokerObserver1.getMarketValue());
        assert (newValue == brokerObserver2.getMarketValue());

    }

    @Test
    void testBrokerIsNotUpdatedIfDeattached() {

        BrokerAgency brokerAgency = new BrokerAgency();

        Broker brokerObserver1 = new Broker();

        brokerAgency.addObserver(brokerObserver1);

        brokerAgency.getBrokers();

        int oldValue = 5;
        brokerAgency.setMarketValue(oldValue);

        assert (oldValue == brokerObserver1.getMarketValue());

        int newValue = 10;
        brokerAgency.removeObserver(brokerObserver1);
        brokerAgency.setMarketValue(newValue);
        assertNotEquals(newValue, brokerObserver1.getMarketValue());

    }

    @Test
    void testBrokerIsDeattachedWhenRemoved() {

        BrokerAgency brokerAgency = new BrokerAgency();
        Broker brokerObserver1 = new Broker();
        Broker brokerObserver2 = new Broker();


        brokerAgency.addObserver(brokerObserver1);
        brokerAgency.addObserver(brokerObserver2);

        brokerAgency.removeObserver(brokerObserver1);
        List<Broker> brokerList2 = brokerAgency.getBrokersList();

        assertThat(brokerObserver1).isNotIn(brokerList2);

    }
}