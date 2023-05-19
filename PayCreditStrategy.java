import java.util.Scanner;
public class PayCreditStrategy implements PaymentTypeStrategy {

    private String cardNumber;
    private String cardExpiration;
    private String cvv;

    public PayCreditStrategy(String cardNumber, String cardExpiration, String cvv) {
        this.cardNumber = cardNumber;
        this.cardExpiration = cardExpiration;
        this.cvv = cvv;

    }
    public boolean valid(PayCreditStrategy c){
        if (c.cardNumber.length() != 16)
            return false;
        else if (c.cardExpiration.length()!=5)
            return false;
        else if ( c.cvv.length()!=3)
            return false;
        else
            return true;
    }
    @Override
    public void pay(double amount) {
        // Code to handle the credit card payment
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your credit card number: ");
        String c = scanner.nextLine();
        System.out.println("Please enter the expiration date (MM/YY): ");
        String e= scanner.nextLine();
        System.out.println("Please enter the CVV: ");
        String v = scanner.nextLine();
        PayCreditStrategy card= new PayCreditStrategy(c,e,v);

        //Checks if credit card is valid
        if(valid(card)) {

            System.out.println("Paying " + amount + " using credit card " + card.cardNumber);
        }
        else
            System.out.println("Credit Card is invalid");

    }

    @Override
    public String payType() {
        return "Credit";
    }

    @Override
    public boolean tax() {
        return true;
    }

    @Override
    public double cashbackAmount() {
        return 0.03; // 3% cashback for credit card payments
    }
}




