import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerComponentTest {

  @Test
  public void testAddPoints() {
    Customer customer = new Customer("Alice", 0);
    assertEquals(0, customer.getPoints());
    
    customer.addPoints(100);
    assertEquals(100, customer.getPoints());
    
    customer.addPoints(50);
    assertEquals(150, customer.getPoints());
  }

}
