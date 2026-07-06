package assignment1;

import java.util.Scanner;

public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int maxCount = 0;
        int minCount = 0;
        int firstMaxPos = -1;
        int lastMinPos = -1;

        // First find max and min
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Count occurrences and find positions
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                maxCount++;
                if (firstMaxPos == -1) {
                    firstMaxPos = i + 1;   // position (1-based)
                }
            }

            if (arr[i] == min) {
                minCount++;
                lastMinPos = i + 1;   // keeps updating → last occurrence
            }
        }

        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + firstMaxPos + ".");
        System.out.println("Last occurrence of minimum element is at position " + lastMinPos + ".");

        sc.close();
    }
}