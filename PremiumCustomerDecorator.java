public class PremiumCustomerDecorator implements Observer {
    private Customer customer;

    // The constructor initializes the customer object that decorator will modify
    public PremiumCustomerDecorator(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void update(Customer customer) {
        // This method is called when the customer's points are updated
        int currentPoints = customer.getPoints();
        if (currentPoints > 10000) {
            System.out.println("Congratulations, " + customer.getName() + "!");
            System.out.println("You are now a premium customer!");
        }
    }

    // This method allows the customer to redeem their points for rewards
    public void redeemPoints() {
        if (customer.getPoints() >= 1000) {
            double rewardAmount = customer.getPoints() / 100.0;
            customer.addPoints((int) (-1000)); // deduct 1000 points from the customer's balance
            System.out.println("Congratulations! You redeemed " + rewardAmount + " dollars.");
        } else {
            System.out.println("Sorry, you need at least 1000 points to redeem rewards.");
        }
    }

    // This method allows the customer to add points to their account
    public void addPoints(int pointsEarned) {
        customer.addPoints(pointsEarned);
    }

    // This method returns the customer's name
    public String getName() {
        return customer.getName();
    }

    // This method returns the customer's current point balance
    public int getPoints() {
        return customer.getPoints();
    }
}