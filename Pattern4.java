
import java.util.*;
public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=x;j++){
                System.out.print(j + " ");
                
            }
            x--;
            System.out.println();
        }
        sc.close();
    }

}
