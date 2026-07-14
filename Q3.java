package assignment1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int m=n,sum=0,pdt=1;
		while(m!=0) {
			int r=m%10;
			sum+=r;
			pdt*=r;	
			m/=10;
		}
		
		if (sum==pdt)
			System.out.println(n+" is a spy number.");
		else 
			System.out.println("Not a spy number.");
sc.close();
    }

}
