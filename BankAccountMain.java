import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = Math.max(initialBalance, 0); 
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}
class BankAccountMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount ac1 = new BankAccount("sbi2989028", "pranay kumar", 40000000d);
        BankAccount ac2 = new BankAccount("sbi009239", "Akshay sir", 873873d);
        BankAccount ac3 = new BankAccount("pnb238790", "govind raj", 2384938d);
        System.out.println(ac1.getAccountNumber());
        System.out.println(ac1.getAccountHolderName());
        System.out.println(ac1.getBalance());
        ac1.setAccountHolderName(sc.nextLine());
        System.out.println(ac1.getAccountHolderName());
        System.out.println("---------------------------------------------");
        System.out.println(ac2.getAccountHolderName());
        System.out.println(ac2.getBalance());
        System.out.println(ac2.getAccountNumber());
        ac2.setAccountHolderName(sc.nextLine());
        System.out.println(ac2.getAccountHolderName());
        System.out.println("---------------------------------------------");
        System.out.println(ac3.getAccountNumber());
        System.out.println(ac3.getAccountHolderName());
        System.out.println(ac3.getBalance());
        ac3.setAccountHolderName(sc.nextLine());
        System.out.println(ac3.getAccountHolderName());
        System.out.println("---------------------------------------------");
    }
}