import java.util.Scanner;

public class Main implements Observer {
  static final int POINTS_PER_DOLLAR = 10;
  private Customer customer;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get customer information from user input
    System.out.println("Welcome to the Rewards Program!");
    System.out.println("Please enter your name: ");
    String customerName = scanner.nextLine();
    int customerPoints = 0;

    // Create Customer object and register the RewardsProgram as an observer
    Customer customer = new Customer(customerName, customerPoints);
    Main rewardsProgram = new Main();
    customer.registerObserver(rewardsProgram);
    rewardsProgram.setCustomer(customer);

    // Main program loop
    while (true) {
      // Display customer information and menu options
      System.out.println("Customer: " + customer.getName());
      System.out.println("Points: " + customer.getPoints());
      System.out.println("1. Make a purchase");
      System.out.println("2. Redeem points");
      System.out.println("3. Exit");
      System.out.println("Please enter an option (1-3): ");

      // Get user input and perform action based on selected option
      int option = scanner.nextInt();
      switch (option) {
        case 1: // Make a purchase
          // Get purchase amount from user input
          System.out.println("Please enter the purchase amount: ");
          double purchaseAmount = scanner.nextDouble();
          // Calculate points earned and add them to the Customer
          int pointsEarned = (int) (purchaseAmount * POINTS_PER_DOLLAR);
          customer.addPoints(pointsEarned);
          break;
        case 2: // Redeem points
          customer.redeemPoints();
          break;
        case 3: // Exit
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option. Please enter a number between 1 and 3.");
      }
    }
  }

  public void update(Customer customer) {
    System.out.println("Congratulations, " + customer.getName() + "!");
    System.out.println("You have earned " + customer.getPoints() + " points!");
    PurchaseInfo info = PurchaseInfo.getPurchaseInfo();
    System.out.println("Your purchase ID is: " + info.getPurchaseID());
    System.out.println("Date of purchase: " + info.getTimeOfPurchase().getMonth() + " " + info.getTimeOfPurchase().getDayOfMonth() + ", " + info.getTimeOfPurchase().getYear());
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
