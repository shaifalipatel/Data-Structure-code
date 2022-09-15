package design_pattern.ObserverAndObserable.Observable;

import design_pattern.ObserverAndObserable.Observer.ObserverData;

public interface StockNotification {

    void add(ObserverData observerData);
    void remove(ObserverData observerData);
    void notifySubscribe();
    void setStockCount(int count);
    int getStockCount();
}
