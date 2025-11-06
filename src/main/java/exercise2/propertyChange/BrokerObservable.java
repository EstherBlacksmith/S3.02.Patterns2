package exercise2.propertyChange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class BrokerObservable {
    private int downJones;
    private int ibex35;

    private PropertyChangeSupport support;

    public BrokerObservable() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.addPropertyChangeListener(propertyChangeListener);
    }

    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        support.removePropertyChangeListener(propertyChangeListener);
    }

    public void setDownJones(int value) {
        support.firePropertyChange("downJones", this.downJones, value);
        this.downJones = value;
    }

    public void setibex35(int value) {
        support.firePropertyChange("ibex35", this.ibex35, value);
        this.ibex35 = value;
    }
}
