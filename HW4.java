package assignment1;
import java.util.*;

public class HW4 {

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length]; 

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        
        double[][] A = new double[r1][c1];
        double[][] B = new double[r2][c2];
        
        if(A.length != B.length || A[0].length != B[0].length){
            System.out.println("Matrices cannot be added (dimensions not compatible).");
            return;
        }

        System.out.println("Enter elements of Matrix A:");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                A[i][j] = sc.nextDouble();

        System.out.println("Enter elements of Matrix B:");
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                B[i][j] = sc.nextDouble();

        double[][] C = addMatrix(A,B);

        if(C != null){
            System.out.println("Sum of matrices:");
            for(int i=0;i<C.length;i++){
                for(int j=0;j<C[0].length;j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
