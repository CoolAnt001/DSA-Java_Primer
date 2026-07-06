package assignment1;
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] lines = new String[100];  // array to store lines
        int count = 0;

        System.out.println("Enter lines (type END to stop):");

        // Read lines
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) {
                break;
            }
            lines[count] = line;
            count++;
        }

        // Print lines in reverse order
        System.out.println("\nLines in reverse order:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }

        sc.close();
    }
}