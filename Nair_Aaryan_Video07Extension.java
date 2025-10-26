/**
 * Aaryan Nair
 * September 29th 2025
 * Extension of Video 7 (Calculator w/ all operations)
 */ 
package Y10T1;
import java.util.Scanner;

public class Nair_Aaryan_Video07Extension {
	
	public static void main(String[] args) {
		
		Scanner CalcInput = new Scanner(System.in); // Creating a scanner
		double fnum, snum, answer; // Defining Variables
		int operation; // Defining Variables
		
		// Asking & Deciding operation
		System.out.println("Choose an operation:"); 
        System.out.println("1 - Addition");
	    System.out.println("2 - Subtraction");
	    System.out.println("3 - Multiplication");
		System.out.println("4 - Division");
	    System.out.print("Enter your choice (1-4): ");
		        operation = CalcInput.nextInt();

		// Asking for numbers
		System.out.println("Enter first number:");
		fnum = CalcInput.nextDouble();
		
		System.out.println("Enter second number:");
		snum = CalcInput.nextDouble();
		
		// Performing the calculations
		if (operation == 1) {
			answer = fnum + snum;
			System.out.println("Result of addition " + answer);
			
		} else if (operation == 2) {
			answer = fnum - snum;
			System.out.println("Result of subtraction " + answer);
			
		} else if (operation == 3) {
			answer = fnum * snum;
			System.out.println("Result of multiplication" + answer);
			
		} else if (operation == 4) {
			if (snum != 0) {
				answer = fnum / snum;
				System.out.println("Result of division " + answer);
				
			} else {
				System.out.println("Error: You can't divide by 0!");
			}
			
		} else {
			System.out.println("Invalid, you've got to select a number between 1 and 4!");
		}
	
	CalcInput.close();
	System.out.println("This program was made by Aaryan Nair on 29/9/25");

}
	
}
