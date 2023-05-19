// Points Reward class
class PointsReward implements Reward {
    private int customerPoints;

    PointsReward() {
        this.customerPoints = 0;
    }

    @Override
    public void processReward(double purchaseAmount) {
        if (purchaseAmount < 0) {
            System.out.println("Invalid purchase amount. Please enter a positive value.");
            return;
        }
        int POINTS_PER_DOLLAR = 10;
        int pointsEarned = (int) (purchaseAmount * POINTS_PER_DOLLAR);
        customerPoints += pointsEarned;
        System.out.println("You earned " + pointsEarned + " points for this purchase.");
    }

    public int getCustomerPoints() {
        return customerPoints;
    }

    public void setCustomerPoints(int customerPoints) {
        if (customerPoints < 0) {
            System.out.println("Invalid points value. Please enter a positive value.");
            return;
        }
        this.customerPoints = customerPoints;
    }
}
