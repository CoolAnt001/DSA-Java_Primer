package assignment1;

import java.util.Scanner;

public class Q5 {
	public static int SumOfDigits(int n) {
		int sum=0;
		while (n!=0) {
		    int r=n%10;
	        	sum+=r;
	     	n/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int m=n;
		while (m>10) {
			m=SumOfDigits(m);
		}
	    System.out.println("Sum of digits of "+n+" until the number is a single digit is "+m);
	sc.close();
	}

}
