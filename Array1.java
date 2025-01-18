import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        System.out.println("--------------");
        System.out.println("even nos..");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("-------------------");
        System.out.println("reverse direction");
        int lo = 0;
        int hi = arr.length - 1;
        for (lo = 0; lo < arr.length / 2; lo++) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            hi--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int key;
        key = sc.nextInt();
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("element found");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("element not found19");
        }

    }
}
