package exercise2.classicObserver;

public class Broker implements DownJones {
    private int marketValue;

    @Override
    public void update(int marketValue) {
        this.setMarketValue(marketValue);
    }


    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }
}
