public class PayCashStrategy implements PaymentTypeStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paying "+amount+" using Cash");
    }
    @Override
    public String payType() {
        return "Cash";
    }
    @Override
    public boolean tax() {
        return false;
    }
    @Override
    public double cashbackAmount() {
        return 0;
    }
}
