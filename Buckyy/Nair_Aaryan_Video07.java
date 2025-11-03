/**
 * Aaryan Nair
 * September 8th 2025
 * Basic Addition Calculator (Video 7)
 */
package Y10T1;
import java.util.Scanner;

public class Nair_Aaryan_Video07 {
	
	public static void main(String[] args) {
	
	Scanner CalcInput = new Scanner(System.in); // Creating a scanner
	double fnum, snum, answer;
	
	System.out.println("Enter First Number: "); // Asking For User Input (First Num)
	fnum = CalcInput.nextDouble(); // Scanner for User Input (First Num)
	
	System.out.println("Enter Second Number: "); // Asking For User Input (Second Num)
	snum = CalcInput.nextDouble(); // Scanner for User Input (Second Num)
	
	answer = fnum + snum; // Adding User Input Together and storing in variable (answer)
	System.out.println(answer); // Printing answer variable
	
	System.out.println("This program was made by Aaryan Nair on 8/9/25"); // End of Program
		
	CalcInput.close();
	
	} // End Of Main
} // End Of Class
