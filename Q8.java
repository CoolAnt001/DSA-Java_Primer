package assignment1;
import java.util.*;

public class Q8 {
	public static void main(String[]args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter dimensions: ");
	    int[][] A= CreateArray(sc.nextInt(),sc.nextInt());
	    displayArray(A);
	   // System.out.println(Arrays.deepToString(A));
	    
	    int sum=0;
	    for (int i=0;i<A.length;i++) 
    	        for (int j=0;j<A[0].length;j++) 
    	    	        sum+=A[i][j];    	    	    
            System.out.println("The sum of all the elements of the 2D-Array is "+sum);
    }
	public static int[][] CreateArray(int m, int n) {
		int[][] arr=new int[m][n];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array elements: ");
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		return arr;	
	}
    public static void displayArray(int[][] arr) {
    	    for (int i=0;i<arr.length;i++) {
    	    	    for (int j=0;j<arr[0].length;j++) 
    	    	    	    System.out.print(arr[i][j]+"\t");    	    	    
    	        System.out.println();
    	    }
    }
    
    
}
