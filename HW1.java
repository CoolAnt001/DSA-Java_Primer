package assignment1;
import java.util.Scanner;
public class HW1{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a: ");
	        int a = sc.nextInt();

	        System.out.print("Enter b: ");
	        int b = sc.nextInt();

	        System.out.print("Enter c: ");
	        int c = sc.nextInt();

	        if (a + b == c) {
	            System.out.println("a + b = c");
	        } 
	        else if (a - b == c) {
	            System.out.println("a - b = c");
	        } 
	        else if (a * b == c) {
	            System.out.println("a * b = c");
	        } 
	        else if (a == b + c) {
	            System.out.println("a = b + c");
	        } 
	        else if (a == b - c) {
	            System.out.println("a = b - c");
	        } 
	        else if (a == b * c) {
	            System.out.println("a = b * c");
	        } 
	        else {
	            System.out.println("Not a correct arithmetic formula");
	        }

	        sc.close();
	    }

}
