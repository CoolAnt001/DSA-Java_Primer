package assignment1;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter person Weight in kg: ");
		double Weight=sc.nextDouble();
		System.out.print("Enter height of person in meter: ");
		double Height=sc.nextDouble();
	    
		double BMI=Weight/(Height*Height);
		
		System.out.println("BMI: "+BMI);
		System.out.print("This person is ");
		if (BMI<18.5) 
			System.out.println("Underweight");
		else if 
			(BMI<24.9) System.out.println("Normal Weight");
		else if 
			(BMI<29.9) System.out.println("Over Weight");
		else 
			System.out.println("Obese");
		
sc.close();
	}

}
