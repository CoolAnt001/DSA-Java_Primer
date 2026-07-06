package assignment1;

import java.util.Scanner;

public class Q6 {
	public static boolean isOdd(int n) {
		if ((n&1)==1)
			return true;
		else return false;
		
	}
    
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(n+" is an odd number: "+isOdd(n));

	}
}
