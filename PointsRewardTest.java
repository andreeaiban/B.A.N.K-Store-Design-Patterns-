import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
class PointsRewardTest {

    private PointsReward pointsReward;

    @BeforeEach
    public void setUp() {
        pointsReward = new PointsReward();
        assertNotNull(pointsReward, "pointsReward should not be null after setUp()");
    }

    @Test
    public void testProcessRewardEarnPoints() { // checks if expected points is 10*purchase amount
        double purchaseAmount = 10.0;
        int expectedPoints = 100;

        pointsReward.processReward(purchaseAmount);

        assertEquals(expectedPoints, pointsReward.getCustomerPoints(), "Points should be 100 after processing the reward.");
    }

    @Test
    public void testProcessRewardEarnZeroPoints() {
        double purchaseAmount = 0.0;
        int expectedPoints = 0;

        pointsReward.processReward(purchaseAmount);

        assertEquals(expectedPoints, pointsReward.getCustomerPoints(), "Points should be 0 after processing the reward.");
    }
}