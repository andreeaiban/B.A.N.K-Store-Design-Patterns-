import org.junit.Test;
import static org.junit.Assert.*;

public class PremiumCustomerDecoratorTest {

    // Test to check if a customer with more than 10000 points becomes a premium customer
    @Test
    public void testIsPremiumCustomer() {
        // Create a new customer named Maria with 0 points
        Customer customer = new Customer("Maria", 0);

        // Wrap the customer object in a premium customer decorator object
        PremiumCustomerDecorator premiumCustomerDecorator = new PremiumCustomerDecorator(customer);

        // Add 11000 points to the customer's account
        premiumCustomerDecorator.addPoints(11000);

        // Update the premium customer decorator with the customer object
        premiumCustomerDecorator.update(customer);

        // Check if Maria is now a premium customer 
        assertTrue(premiumCustomerDecorator.getPoints() == 1000);
    }

    // Test to check if a customer with less than 10000 points does not become a premium customer
    @Test
    public void testIsNotPremiumCustomer() {
        // Create a new customer with 0 points
        Customer customer = new Customer("Henry", 0);

        // Wrap the customer object in a premium customer decorator object
        PremiumCustomerDecorator premiumCustomerDecorator = new PremiumCustomerDecorator(customer);

        // Add 5000 points to the customer's account
        premiumCustomerDecorator.addPoints(5000);

        // Update the premium customer decorator with the customer object
        premiumCustomerDecorator.update(customer);

        // Check if Henry is not a premium customer 
        assertFalse(premiumCustomerDecorator.getPoints() == 1000);
    }
}



