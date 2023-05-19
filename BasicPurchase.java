import java.time.LocalDateTime;

public class BasicPurchase implements Purchase {
    static private int _currentID = 1;
    private int purchaseID; //A unique ID for the purchase.
    private LocalDateTime timeOfPurchase; //The time of the purchase
    private double purchaseAmount;// The amount of the purchase

    public BasicPurchase(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        this.timeOfPurchase = LocalDateTime.now(); 

        this.purchaseID = _currentID;
        _currentID++;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public LocalDateTime getTimeOfPurchase() {
        return timeOfPurchase;
    }

    public int getPurchaseID() {
        return purchaseID;
    }
}
