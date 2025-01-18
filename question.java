import java.util.Scanner;
class Operation{
    static int a;
    static int b;
    static int c;

    static void add(int a, int b){
        System.out.println("answer: "+ (a+b));
    }
    static void add(int a, int b, int c){
        System.out.println("answer: "+ (a+b+c));
    }
    static void subtract(int a, int b){
        System.out.println("answer: "+ (a-b));
    }
    static void subtract(int a, int b, int c){
        System.out.println("answer: "+ (a-b-c));
    }
    static void multiply(int a, int b){
        System.out.println("answer: "+ (a*b));
    }
    static void multiply(int a, int b, int c){
        System.out.println("answer: "+ (a*b*c));
    }
    static void divide(int a, int b){
        System.out.println("answer: "+ (a/b));
    }
    static void divide(int a, int b, int c){
        System.out.println("answer: "+ ((a/b)/c));
    }
}
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        boolean flag  = true;
        while (flag == true) {
        System.out.println("-------------------------------");    
        System.out.println("1. Add 2 numbers");
        System.out.println("2. Add 3 numbers");
        System.out.println("3. subtract 2 numbers");
        System.out.println("4. subtract 3 numbers");
        System.out.println("5. multiply 2 numbers");
        System.out.println("6. multiply 3 numbers");
        System.out.println("7. divide 2 numbers");
        System.out.println("8. divide 3 numbers");
        System.out.println("0. exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("enter first and 2nd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                Operation.add(a,b);
                break;
            case 2:
                System.out.println("enter first, 2nd and 3rd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                Operation.add(a,b,c);
                break;
            case 3:
                System.out.println("enter first and 2nd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                Operation.subtract(a,b);
                break;
            case 4:
                System.out.println("enter first, 2nd and 3rd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                Operation.subtract(a,b,c);
                break;
            case 5:
                System.out.println("enter first and 2nd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                Operation.multiply(a,b,c);
                break;
            case 6:
                System.out.println("enter first, 2nd and 3rd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                Operation.multiply(a,b,c);
                break;
            case 7:
                System.out.println("enter first and 2nd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                Operation.divide(a,b);
                break;
            case 8:
                System.out.println("enter first, 2nd and 3rd number with spaces");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                Operation.divide(a,b,c);
                break;
            case 0:
                System.out.println("Exiting.....");
                flag = false;
                break;
            default:
                System.out.println("invalid choice try again");
                break;
        }

    }
        
    }
}
