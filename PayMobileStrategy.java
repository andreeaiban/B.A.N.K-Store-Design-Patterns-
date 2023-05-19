import java.util.Scanner;
public class PayMobileStrategy implements PaymentTypeStrategy {

    private String phoneNumber;

    public PayMobileStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using Mobile Tap-to-Pay");
        System.out.println("Enter your PIN to confirm payment...");
        Scanner scanner = new Scanner(System.in);
        String pin = scanner.nextLine();
        System.out.println("Payment of " + amount + " successfully made from " + phoneNumber + " with PIN " + pin);
    }

    @Override
    public String payType() {
        return "Mobile Tap-to-Pay";
    }

    @Override
    public boolean tax() {
        return true;
    }

    @Override
    public double cashbackAmount() {
        return 0.01; // 1% cashback for mobile tap-to-pay
    }
}
