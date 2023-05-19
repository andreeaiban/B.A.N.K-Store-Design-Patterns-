import java.time.LocalDateTime;

public abstract class PurchaseDecorator implements Purchase { //abstract class that represents a decorated purchase
    protected Purchase decoratedPurchase;

    public PurchaseDecorator(Purchase decoratedPurchase) {
        this.decoratedPurchase = decoratedPurchase;
    }

    public double getPurchaseAmount() {
        return decoratedPurchase.getPurchaseAmount();
    }

    public LocalDateTime getTimeOfPurchase() {
        return decoratedPurchase.getTimeOfPurchase();
    }

    public int getPurchaseID() {
        return decoratedPurchase.getPurchaseID();
    }
}
