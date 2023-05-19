import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CustomerTest2 {

    @Test
    public void testAddPoints() {
        Customer customer = new Customer("John Doe", 0);
        customer.addPoints(100);
        assertEquals(100, customer.getPoints());
    }

    @Test
    public void testRedeemPoints() {
        Customer customer = new Customer("Jane Smith", 1000);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        customer.redeemPoints();
        assertEquals("Congratulations! You redeemed 10.0 dollars.\n", outContent.toString());
        assertEquals(0, customer.getPoints());
    }
}

