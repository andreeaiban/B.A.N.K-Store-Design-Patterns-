import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest1 {
    @Test
    public void testAddPoints() {
        Customer customer = new Customer("Alice", 0);
        customer.addPoints(100);
        assertEquals(100, customer.getPoints());
    }

    @Test
    public void testRedeemPoints() {
        Customer customer = new Customer("Bob", 1500);
        customer.redeemPoints();
        assertEquals(0, customer.getPoints());
    }
}
