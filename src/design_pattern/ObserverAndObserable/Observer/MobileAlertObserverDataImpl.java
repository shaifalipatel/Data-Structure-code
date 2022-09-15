package design_pattern.ObserverAndObserable.Observer;

public class MobileAlertObserverDataImpl implements ObserverData{
    int number;
    private ObserverData observerData;
    MobileAlertObserverDataImpl(int number,ObserverData observerData){
        this.number = number;
        this.observerData= observerData;
    }
    /**
     *
     */
    @Override
    public void update() {
        System.out.println(number+"product are in stock");
    }
}
