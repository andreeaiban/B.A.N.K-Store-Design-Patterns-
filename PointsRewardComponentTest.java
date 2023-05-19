import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PointsRewardComponentTest {

    // Declare RewardFactory and Reward objects
    private RewardFactory rewardFactory;
    private Reward reward;

    // Initialize RewardFactory and Reward objects before each test
    @BeforeEach
    public void setUp() {
        rewardFactory = new RewardFactory();
        reward = rewardFactory.getReward("POINTS");
        assertNotNull(reward, "Reward should not be null after setup");
    }

    // Test if RewardFactory returns a PointsReward object
    @Test
    public void testRewardFactoryReturnsPointsReward() {
        assertTrue(reward instanceof PointsReward, "Reward should be an instance of PointsReward");
    }

    // Test the integration of RewardFactory and PointsReward classes
    @Test
    public void testRewardFactoryIntegration() {
        // Define a purchase amount and the expected points after processing the reward
        double purchaseAmount = 50.0;
        int expectedPoints = 500;

        // Process the reward using the Reward object
        reward.processReward(purchaseAmount);

        // Cast the Reward object to a PointsReward object and assert that the customer points are updated as expected
        PointsReward pointsReward = (PointsReward) reward;
        assertEquals(expectedPoints, pointsReward.getCustomerPoints(), "Customer points should be 500 after processing reward");
    }
}
