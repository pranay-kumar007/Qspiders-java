import java.util.Scanner;
public class MultipleOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m<n) {
            
            if (m%3 == 0) {
                System.out.println(m);
            }
            m++;

        }
    }
}
