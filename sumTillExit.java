import java.util.Scanner;
public class sumTillExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int sum = 0;
        while(x != -1){
            x = sc.nextInt();
            if (x != -1) {
                sum += x;
            }
            
        } 
        System.out.println("sum of all numbers you entered is: "+sum);
        sc.close();
    }
    
}
