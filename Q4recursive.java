package assignment1;

import java.util.Scanner;

public class Q4recursive {
    public static void permute(String[] arr, int index) {
        if (index == arr.length) {
		    printArray(arr);
		        return;
	    }

		for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);          // choose
		    permute(arr, index + 1);      // explore
		    swap(arr, index, i);          // un-choose (backtrack)
	    }
	}

	static void swap(String[] arr, int a, int b) {
	    String temp = arr[a];
		arr[a] = arr[b]; 
		arr[b] = temp;
    }

	static void printArray(String[] arr) {
		for (String s : arr)
		    System.out.print(s);
		System.out.println();
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the characters seperated by spaces: ");
		String s=sc.nextLine();
		String[] arr=s.split("\\s+");
		permute(arr, 0);
	sc.close();
		    }
}
