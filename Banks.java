class RBI{

    double checkInterest(double amount, double time){
        return amount + 0;
    }
}
class SBI extends RBI{
    @Override
    double checkInterest(double amount, double time){
        return amount + ((5.62/100)*amount)*time;
    }
}
class HDFC extends RBI{
    @Override
    double checkInterest(double amount, double time){
        return amount + ((7.11/100)*amount)*time;
    }
}
class ICICI extends RBI{
    @Override
    double checkInterest(double amount, double time){
        return amount + ((6.97/100)*amount)*time;
    }
}
public class Banks {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        RBI account;
        boolean flag = true;
        while (flag == true) {
            System.out.println("Enter the Principle amount");
            double amount = sc.nextDouble();
            System.out.println("Enter the time interval");
            double time = sc.nextDouble();
            System.out.println("Choose a bank");
            System.out.println("1. RBI BANK");
            System.out.println("2. SBI BANK");
            System.out.println("3. HDFC BANK");
            System.out.println("4. ICICI BANK");
            System.out.println("0. EXIT");

            int choice = sc.nextInt();
        switch (choice) {
            case 1:
                account = new RBI();
                System.out.println("amount you rrecieve is: " + account.checkInterest(amount, time));
                break;
            case 2:
                account = new HDFC();
                System.out.println("amount you rrecieve is: " + account.checkInterest(amount, time));
                break;
            case 3:
                account = new SBI();
                System.out.println("amount you rrecieve is: " + account.checkInterest(amount, time));
                break;
            case 4: 
                account = new ICICI();
                System.out.println("amount you rrecieve is: " + account.checkInterest(amount, time));
                break;
            case 0:
                flag = false;
                System.out.println("Exiting......");
                break;

            default:
                break;
        }
        }
        


    }
}
