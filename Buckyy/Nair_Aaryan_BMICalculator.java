/**
 * Aaryan Nair
 * September 18th 2025
 * BMI Calculator (Video 7 Extension)
 */

package Y10T1;
import java.util.Scanner;

public class Nair_Aaryan_BMICalculator {
	
	public static void main(String[] args) {
	
	Scanner UserInput = new Scanner(System.in); // Creating a scanner
	double weight, height, bmi;
	
	
	System.out.println("Enter your weight (kg): "); // Asking For User Input (weight)
	weight = UserInput.nextDouble(); // Scanner for User Input (weight)
	
	
	System.out.println("Enter your height (cm): "); // Asking For User Input (height)
	height = UserInput.nextDouble() / 100; // Scanner for User Input & converting to meters (height)
	
	bmi = weight / (height * height); // Doing calculations (bmi)
	
	if (bmi < 18.5) {
	System.out.println("You're Underweight");
	
	} else if (bmi < 25) {
		System.out.println("You're at a Normal Weight :)");
		
	} else if (bmi < 30) {
		System.out.println("You're Overweight");
		
	} else {
		System.out.println("You're Obese :(");
	}
	System.out.println(bmi); // Printing BMI
	
	
	System.out.println("This program was made by Aaryan Nair on 18/9/25"); // End of Program
		
	
	UserInput.close();
	
	} // End Of Main
} // End Of Class
