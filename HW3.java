package assignment1;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Enter elements of array a:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter elements of array b:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Element-wise product
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        System.out.println("Result array c:");
        for (int i = 0; i < n; i++) {
            System.out.print(c[i] + " ");
        }

        sc.close();
    }
}