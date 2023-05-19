import java.time.LocalDateTime;

public class DiscountDecorator extends PurchaseDecorator { //purchase that has been discounted
    private double discountAmount;

    public DiscountDecorator(Purchase decoratedPurchase, double discountAmount) {
        super(decoratedPurchase);
        this.discountAmount = discountAmount;
    }

    public double getPurchaseAmount() {
        return decoratedPurchase.getPurchaseAmount() - discountAmount;
    }
}
