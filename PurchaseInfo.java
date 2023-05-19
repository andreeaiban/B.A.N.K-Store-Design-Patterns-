import java.time.LocalDateTime;
public class PurchaseInfo
{
    static private int _currentID = 1;
    private int purchaseID;
    private LocalDateTime timeOfPurchase;
    private double purchaseAmount;

    private PurchaseInfo()
    {
        this.timeOfPurchase = LocalDateTime.now();
    }
    static public PurchaseInfo getPurchaseInfo()
    {
        PurchaseInfo purchaseInfo = new PurchaseInfo();
        purchaseInfo.purchaseID = _currentID;
        _currentID++;
        return purchaseInfo;
    }
    public LocalDateTime getTimeOfPurchase()
    {
        return timeOfPurchase;
    }
    public int getPurchaseID()
    {
        return purchaseID;
    }
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}