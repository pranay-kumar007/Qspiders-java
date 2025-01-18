import java.util.Scanner;
public class Calculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x ;
        double y ;
        char operator;
        String bool = "yes";
        while (bool.equals("yes")) {
            System.out.println("do you want to continue with any calculation");
            
            bool = sc.nextLine();
            if (bool.equals("yes")) {
                System.out.println("write the expression to perform: ");
                x = sc.nextDouble();
                operator = sc.next().charAt(0);
                y = sc.nextDouble();
                sc.nextLine(); 
            switch (operator) {
            case '+':
                System.out.println("answer is : " + (x+y));
                break;
            case '-':
                System.out.println("answer is : " + (x-y));
                break;
            case '*':
                System.out.println("answer is : " + (x*y));
                break;
            case '/':
                System.out.println("answer is : " + (x/y));
                break;
            case '%':
                System.out.println("answer is : " + (x%y));
                break;
            default:
            System.out.println("enter valid operator");
                break;
            }       
         } 
         else{
            System.out.println("good bye .....");
            break;
         }
        }
        sc.close();
    }
}
