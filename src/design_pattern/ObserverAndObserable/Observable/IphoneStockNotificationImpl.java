package design_pattern.ObserverAndObserable.Observable;

import design_pattern.ObserverAndObserable.Observer.ObserverData;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockNotificationImpl implements StockNotification {
    List<ObserverData> observerDataList = new ArrayList<>();
    int count =0;
    /**
     * @param observerData
     */
    @Override
    public void add(ObserverData observerData) {
        observerDataList.add(observerData);
    }

    /**
     *
     */
    @Override
    public void remove(ObserverData observerData) {
        observerDataList.remove(observerData);
    }

    /**
     *
     */
    @Override
    public void notifySubscribe() {
        for (ObserverData observerData:observerDataList) {
            observerData.update();
        }
    }

    /**
     * @param newCount
     */
    @Override
    public void setStockCount(int newCount) {
        if(count ==0){
            notifySubscribe();
        }
        count+= newCount;
    }

    /**
     * @return
     */
    @Override
    public int getStockCount() {
        return count;
    }
}
