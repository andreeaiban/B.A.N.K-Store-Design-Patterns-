import java.time.LocalDateTime;

public interface Purchase {
  double getPurchaseAmount();

  LocalDateTime getTimeOfPurchase();

  int getPurchaseID();
}
