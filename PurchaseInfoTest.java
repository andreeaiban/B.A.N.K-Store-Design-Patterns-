import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseInfoTest {

    @org.junit.jupiter.api.Test
    void getPurchaseInfo()
    {
        PurchaseInfo info = PurchaseInfo.getPurchaseInfo();
        assertTrue(info.getPurchaseID() == 1); //test 1
        info = PurchaseInfo.getPurchaseInfo();
        assertTrue(info.getPurchaseID() == 2); //test 1
        assertTrue(info.getTimeOfPurchase().getDayOfYear() == LocalDateTime.now().getDayOfYear()); //test 2
    }
}