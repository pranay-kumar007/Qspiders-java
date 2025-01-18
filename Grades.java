import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x/10) {
            case 10 :
                System.out.println("A+");
                break;
            case (9) :{
                System.out.println("A");
                break;
            }
            case (8):
                System.out.println("B+");
                break;
            case (7):
                System.out.println("B");
                break;
            case (6):
                System.out.println("C");
                break;
            case (5):
                System.out.println("D");
                break;
            case (4):
                System.out.println("E");
                break;
            default:
                System.out.println("fail");
                break;
        }
    }

}
