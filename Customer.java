// define the Subject interface 
// in this case Customer is the subject

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private int points;
    private List<Observer> observers = new ArrayList<>();

    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public void addPoints(int pointsEarned) {
        points += pointsEarned;
        notifyObservers();
    }

    public void redeemPoints() {
        if (points >= 1000) {
            double rewardAmount = points / 100.0;
            points = 0;
            notifyObservers();
            System.out.println("Congratulations! You redeemed " + rewardAmount + " dollars.");
        } else {
            System.out.println("Sorry, you need at least 1000 points to redeem rewards.");
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
//The Customer class maintains a list of observers and has methods to add points and redeem points. 

//
