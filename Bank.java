import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double bal = 39874.97;

        switch (str) {
            case "view balance":
                System.out.println("your balance is : " + bal);
                break;
            case "deposit money":
                System.out.print("enter the ammount to deposit: ");
                double deposit = sc.nextDouble();
                bal = deposit + bal;
                System.out.println("your balance is : " + bal);
                break;
            case "withdraw money":
                System.out.print("enter the ammount to withdraw: ");
                double withdraw = sc.nextDouble();
                if (bal >= withdraw) {
                   bal = bal- withdraw;
                System.out.println("your balance is : " + bal);
                break; 
                }
                else{
                    System.out.println("insufficient balance");
                }
                
            case "exit":
                break;
            default:
                break;
        }
        sc.close();

    }
}
