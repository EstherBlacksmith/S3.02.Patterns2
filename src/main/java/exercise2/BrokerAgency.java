package exercise2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BrokerAgency implements PropertyChangeListener {
    private int marketValue;

    public void propertyChange(PropertyChangeEvent event) {
        this.setMarketValue((Integer) event.getNewValue());
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }
}
