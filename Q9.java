package assignment1;

import java.util.Scanner;

public class Q9 {
	 
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
	    for (int i=0;i<m.length;i++)  
    	    	    sum+=m[i][i];
	    return sum;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//create array
		System.out.print("Enter size of square array(n*n) :");
		int n=sc.nextInt();
		
		double[][] arr=new double[n][n];
		System.out.print("Enter array elements: ");
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++)
				arr[i][j]=sc.nextDouble();
		
		//display
	    for (int i=0;i<n;i++) {
    	        for (int j=0;j<n;j++) 
    	    	        System.out.print(arr[i][j]+"\t");    	    	    
            System.out.println();
	    }
	    
	    System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));

	}

}
