package exercise2;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BrokerAgency implements PropertyChangeListener {
    private int downJones;
    private int ibex35;


    public void propertyChange(PropertyChangeEvent event) {
        if(event.getPropertyName().equals("downJones")) {
            this.setDownJonesValue((Integer) event.getNewValue());
        }else {
            this.setIbex35Value((Integer) event.getNewValue());
        }
    }

    public int getDownJonesValue() {
        return downJones;
    }

    private void setDownJonesValue(int downJones) {
        this.downJones = downJones;
    }

    public int getIbex35Value() {
        return ibex35;
    }

    private void setIbex35Value(int ibex35) {
        this.ibex35 = ibex35;
    }
}
