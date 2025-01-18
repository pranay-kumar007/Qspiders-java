import java.util.Scanner;

class Ball {
    private String colour;

    public String getColour() {
        return colour;
    }

    Ball() {}

    Ball(String colour) {
        this.colour = colour;
    }
}

class Bag {
    private Ball storedBall;
    
    void addBall(int ballchosen, String colour, double radius) {
        if (storedBall == null) {
            if (ballchosen == 1) {
                storedBall = new TennisBall(colour, radius);
                System.out.println("Tennis ball is added to the bag :)");
            } else if (ballchosen == 2) {
                storedBall = new BasketBall(colour, radius);
                System.out.println("Basketball is added to the bag :)");
            } else {
                System.out.println("Invalid ball choice.");
            }
        } else {
            System.out.println("A ball is already in the bag.");
        }
    }

    void removeBall() {
        if (storedBall != null) {
            System.out.println("Ball is removed from the bag :(");
            storedBall = null;
        } else {
            System.out.println("No ball is in the bag.");
        }
    }

    void checkEmpty() {
        if (storedBall == null) {
            System.out.println("Bag is empty. You can add a ball.");
        } else {
            System.out.println("Bag is not empty.");
        }
    }

    void checkGame() {
        if (storedBall instanceof TennisBall) {
            System.out.println("The bag contains a tennis ball. You can play tennis :)");
            TennisBall tennisBall = (TennisBall) storedBall;
            System.out.println("Radius of the ball is: " + tennisBall.radius);
            System.out.println("Colour of the ball is: " + tennisBall.getColour());
        } else if (storedBall instanceof BasketBall) {
            System.out.println("The bag contains a basketball. You can play basketball :)");
            BasketBall basketBall = (BasketBall) storedBall;
            System.out.println("Radius of the ball is: " + basketBall.radius);
            System.out.println("Colour of the ball is: " + basketBall.getColour());
        } else {
            System.out.println("The bag is empty. Add a ball to check its game.");
        }
    }
}

class TennisBall extends Ball {
    double radius;

    TennisBall(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }
}

class BasketBall extends Ball {
    double radius;

    BasketBall(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }
}

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bag bag = new Bag();
        int choice;

        do {
            System.out.println("--------------Choose action to perform--------------");
            System.out.println("1. Add Ball");
            System.out.println("2. Remove Ball");
            System.out.println("3. Check if Bag is Empty");
            System.out.println("4. Check Game");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("--------------Choose ball--------------");
                    System.out.println("1. Tennis Ball");
                    System.out.println("2. Basketball");
                    int ballChoice = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the colour of the ball:");
                    String colour = sc.nextLine();
                    System.out.println("Enter the radius of the ball:");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    bag.addBall(ballChoice, colour, radius);
                    break;
                case 2:
                    bag.removeBall();
                    break;
                case 3:
                    bag.checkEmpty();
                    break;
                case 4:
                    bag.checkGame();
                    
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
