import java.util.Scanner;
//Bank classss
class Bank{
    //bank details
    String branch;
    //balance
    private double balance = 0;
    //constructor to initialize bank details
    Bank(){} //for impilicit super call 
    Bank(String branch){
        this.branch = branch;
    }
    //method to view balance
    public double getBalance() {
        return balance;
    }
    public void deposit(double depositAmount){
        balance = depositAmount + balance;
        System.out.println("Balance updated to: "+ balance);
    }
    public void withdraw(double withdrawAmount){
        if (balance >= withdrawAmount) {
           balance = balance - withdrawAmount;
           System.out.println("Balance updated to: "+ balance); 
        }
        else{
            System.out.println("insufficient balance....");
        }
        
    }
}

//User class that inherits bank class
class User extends Bank{
    // authentication variables
    private String username;
    private String password;

    // user details
    String accountHolder;
    long contact;
    String address;
    int userId;
    static int count = 0;

    // construstor to initialize user details for a particular user and register a user
    User() {

    }
    User(String accountHolder, long contact, String address, String username, String password,String branch) {
        super(branch);
        this.accountHolder = accountHolder;
        this.contact = contact;
        this.address = address;
        this.username = username;
        this.password = password;
        this.userId = count++;
    }

    // authentication of user
    boolean authentication(String checkUser, String checkPass) {
        if (checkUser.equals(username) && checkPass.equals(password)) {
            return true;    
        }
        return false;
    }
    //display user details
    public void dispUser(){
        System.out.printf("%-20s: %s\n", "Account holder name", accountHolder);
        System.out.printf("%-20s: %d\n", "Contact", contact);
        System.out.printf("%-20s: %s\n", "Address", address);
        
    }
}

//Main class where main method is present.
public class BankMain extends Bank{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte iterator = 1;
        boolean mainflag = true;
        //parameters for registration
        String accountHolder;
        long contact;
        String address;
        String branch;
        String username;
        String password;
        User u = new User("Admin", 6201766211l, "Ranchi,jharkhand", "Pranay", "Pranay@007","Salt Lake");
        while (iterator != 3 && mainflag == true) {  
            //choosing between registration and login
            System.out.println("1. Registration              2. Login");
            System.out.print("Press 1 for registration and 2 for login or 3 to exit : ");
            iterator = sc.nextByte();
            sc.nextLine();
            switch (iterator) {
                case 1:
                    // regestring a user, creating object or user
                    System.out.print("Enter your name: ");
                    accountHolder = sc.nextLine();
                    System.out.print("Enter your contact number: ");
                    contact = sc.nextLong();
                    sc.nextLine();
                    System.err.print("Enter your address: ");
                    address = sc.nextLine();
                    System.out.print("Enter a username: ");
                    username = sc.nextLine();
                    System.out.print("Enter a password: ");
                    password = sc.nextLine();
                    System.out.print("In which branch you want to open your account: ");
                    branch = sc.nextLine();
                    u = new User(accountHolder, contact, address, username, password, branch);
                    System.out.println("registration of " + accountHolder + " is sucessfully done");
                    System.out.println("-----------------------------------------"); 
                    break;
                case 2:
                    //giving the user 3 chances to enter correct username and password
                    int attempts = 0;
                    boolean flag = true;
                    while (attempts < 3 && flag == true) {
                        String checkUser;
                        String checkPass;
                        System.out.print("Enter your username: ");
                        checkUser = sc.nextLine();
                        System.out.print("Enter your password: ");
                        checkPass = sc.nextLine();
                        System.out.println("-----------------------------------------");

                        //if authentication is sucessfull than giving user allowance to access their account 
                        if (u.authentication(checkUser, checkPass) == true) {
                            System.out.println("Logged in Succesfully now choose a option to perform some task");
                            int y = 1;
                            while (y != 0) {
                                //giving user the options to choose
                                System.out.println("1.view user details");
                                System.out.println("2.view current balance");
                                System.err.println("3.deposit money");
                                System.out.println("4.withdraw money");
                                System.out.println("press 0 to logout");
                                System.out.print("Enter Your Choice : ");
                                y = sc.nextInt();
                                switch (y) {
                                        //Display user Details
                                    case 1:
                                        u.dispUser();
                                        System.out.println("-----------------------------------------");
                                        break;
                                    case 2:
                                        //checking current balance
                                        System.out.println("your current balance is: " + u.getBalance());
                                        System.out.println("-----------------------------------------"); 
                                        break;
                                    case 3:
                                        //depositing some amount
                                        System.out.print("Enter the amount you want to deposit: ");
                                        long depositAmount = sc.nextLong();
                                        u.deposit(depositAmount);
                                        System.out.println("-----------------------------------------"); 
                                        break;
                                    case 4:
                                        //withdrawing some amount
                                        System.out.print("Enter the amount you want to withdraw: ");
                                        long withdrawAmount = sc.nextLong();
                                        u.withdraw(withdrawAmount);
                                        System.out.println("-----------------------------------------"); 
                                        break;
                                    case 0:
                                        //loging out
                                        System.out.println("you have been logged out sussecfully.....");
                                        flag = false;
                                        System.out.println("-----------------------------------------"); 
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else {
                            //if login is not sucessfull than incrementing no of attempts done and displaying attempts left
                            attempts++;
                            System.out.println("invalid credentials please try again.....");
                            System.out.println("attempts left " + (3 - attempts));
                        }
                    }
                    //if 3 attempt is utilised than locking the account
                    if (attempts == 3) {
                        System.out.println("You have utilised all your attempts and your account is locked \nplease contact "+ u.branch + " branch to unlock....");
                        mainflag = false;
                        break;
                    }

                default:
                    break;
            }
        }
        sc.close();
    }
}
