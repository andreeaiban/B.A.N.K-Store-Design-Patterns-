import java.util.Scanner;
public interface PaymentTypeStrategy {

        //This will handle each types of method ambiguity b/c different payments ask for different info
        void pay(double amount);
        //This will just provide us with a easy string if we easily wanna just get the name of the payment type
        String payType();

        //This will calculate will let us know if there is tax applied
        boolean tax();
        //This will let us know if a customer will get a cashback amount based on a percentage but will be in form of a decimal to be easier to calculate
        double cashbackAmount();
}
