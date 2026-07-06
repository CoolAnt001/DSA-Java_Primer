package assignment1;
import java.util.*;
public class HW5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        // Fill matrix with random 0s and 1s
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                matrix[i][j] = rand.nextInt(2);

        // Print matrix
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }

        // Find row with most 1s
        int maxRowIndex = 0;
        int maxRowCount = 0;

        for(int i=0;i<4;i++){
            int count = 0;
            
            for(int j=0;j<4;j++)
                if(matrix[i][j] == 1)
                    count++;
            if(count > maxRowCount){
                maxRowCount = count;
                maxRowIndex = i;
            }
        }

        // Find column with most 1s
        int maxColIndex = 0;
        int maxColCount = 0;

        for(int j=0;j<4;j++){
            int count = 0;
            for(int i=0;i<4;i++)
                if(matrix[i][j] == 1)
                    count++;            
            if(count > maxColCount){
                maxColCount = count;
                maxColIndex = j;
            }
        }

        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}