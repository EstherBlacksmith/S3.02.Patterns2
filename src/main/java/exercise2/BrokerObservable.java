package exercise2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BrokerObservable {
    private int marketValue;

    private final PropertyChangeSupport support;

    public BrokerObservable() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setMarketValue(int value) {
        support.firePropertyChange("marketValue", this.marketValue, value);
        this.marketValue = value;
    }
}
