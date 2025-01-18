import java.util.Scanner;

public class LoginSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = null;
        String password = null;
        System.out.println("Register your self in the world of java: ");
        System.out.print("Enter a username: ");
        username = sc.nextLine();

        System.out.print("Enter a password: ");
        password = sc.nextLine();

        System.out.println("Registration Successful.\nPlease login......");

        int attempts = 0;
        boolean bool = false;

        do {
            System.out.print("Enter username: ");
            String checkUsername = sc.nextLine();

            System.out.print("Enter password: ");
            String checkPassword = sc.nextLine();

            if (checkUsername.equals(username) && checkPassword.equals(password)) {
                System.out.println("Login Successful....\nHello " + username + " Welcome to the world of JAVA");
                bool = true;
                break;
            } 
            else {
                attempts++;
                System.out.println("Incorrect username or password please try again.\nAttempts left: " + (3 - attempts));
            }
        } while (attempts < 3);

        if (bool == false) {
            System.out.println("System locked....\nToo many failed attempts.");
        }

        sc.close();
    }
}
