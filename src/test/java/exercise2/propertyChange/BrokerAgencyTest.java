package exercise2.propertyChange;

import org.junit.jupiter.api.Test;

import java.beans.PropertyChangeListener;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BrokerAgencyTest {

    @Test
    void testBrokerIsUpdatedWhenSubjectChanges() {

        BrokerObservable brokerObservable = new BrokerObservable();
        BrokerAgency agency1 = new BrokerAgency();
        BrokerAgency agency2 = new BrokerAgency();
        BrokerAgency agency3 = new BrokerAgency();
        brokerObservable.addPropertyChangeListener(agency1);
        brokerObservable.addPropertyChangeListener(agency2);
        brokerObservable.addPropertyChangeListener(agency3);
        int newValue = 22;
        brokerObservable.setDownJones(newValue);

        System.out.println("Agency 1 New market value: " + agency1.getDownJonesValue());
        System.out.println("Agency 2 New market value: " + agency2.getDownJonesValue());
        System.out.println("Agency 3 New market value: " + agency2.getDownJonesValue());

        assert (newValue == agency1.getDownJonesValue());
        assert (newValue == agency2.getDownJonesValue());
        assert (newValue == agency3.getDownJonesValue());
    }

    @Test
    void testBrokerIsNotUpdatedIfDeattached() {
        BrokerObservable brokerObservable = new BrokerObservable();

        BrokerAgency agency1 = new BrokerAgency();
        BrokerAgency agency2 = new BrokerAgency();
        BrokerAgency agency3 = new BrokerAgency();
        brokerObservable.addPropertyChangeListener(agency1);
        brokerObservable.addPropertyChangeListener(agency2);
        brokerObservable.addPropertyChangeListener(agency3);

        brokerObservable.setDownJones(22);

        brokerObservable.removePropertyChangeListener(agency1);
        int newValue = 33;
        brokerObservable.setDownJones(newValue);

        System.out.println("Agency 1 New market value: " + agency1.getDownJonesValue());
        System.out.println("Agency 2 New market value: " + agency2.getDownJonesValue());
        System.out.println("Agency 3 New market value: " + agency2.getDownJonesValue());

        assert (newValue != agency1.getDownJonesValue());
        assert (newValue == agency2.getDownJonesValue());
        assert (newValue == agency3.getDownJonesValue());

        int oldMarketValue = 44;
        brokerObservable.setibex35(oldMarketValue);

        assert (oldMarketValue != agency1.getIbex35Value());
        assert (oldMarketValue == agency2.getIbex35Value());
        assert (oldMarketValue == agency3.getIbex35Value());

    }


    @Test
    void testBrokerIsDeattachedWhenRemoved() {
        BrokerObservable brokerObservable = new BrokerObservable();

        BrokerAgency agency1 = new BrokerAgency();
        BrokerAgency agency2 = new BrokerAgency();
        BrokerAgency agency3 = new BrokerAgency();

        brokerObservable.addPropertyChangeListener(agency1);
        brokerObservable.addPropertyChangeListener(agency2);
        brokerObservable.addPropertyChangeListener(agency3);
        brokerObservable.removePropertyChangeListener(agency1);
        PropertyChangeListener[] propertyChangeListeners2 = brokerObservable.getPropertyChangeListeners();

        assertThat(propertyChangeListeners2).isNotIn(agency1);

    }
}