package design_pattern.ObserverAndObserable.Observer;

import design_pattern.ObserverAndObserable.Observable.StockNotification;

public class EmailObserverDataImpl implements ObserverData{

    String emailId;
    private ObserverData observerData;
    EmailObserverDataImpl(String emailId,ObserverData observerData){
        this.emailId = emailId;
        this.observerData= observerData;
    }

    /**
     *
     */
    @Override
    public void update() {
        sendMail(emailId, "Product are in stock");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Mail sent to: "+emailId);
    }
}
