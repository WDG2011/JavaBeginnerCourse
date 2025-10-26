/**
 * Aaryan Nair
 * September 8th 2025
 * Math Operators, Trying out a different one (Video 8)
 */
package Y10T1;

import java.util.Scanner;

public class Nair_Aaryan_Video08 {

	public static void main(String[] args) {
		
		Scanner integer_input = new Scanner(System.in); // Creating a scanner
		int fnum, snum, answer;
		
		System.out.println("Enter any integer"); // Requesting User Input
		fnum = integer_input.nextInt(); // Scanner for User Input (First Num)
		
		System.out.println("Enter another integer"); // Requesting User Input
		snum = integer_input.nextInt(); // Scanner for User Input (Second Num)
		
		answer = snum * fnum; // Multipling (can use any operator) both numberes together & storing in a variable (answer)
		System.out.println("I've multiplied both your numbers: " + answer); // Printing out answer
		
		integer_input.close();
		System.out.println("This program was made by Aaryan Nair on 8/9/25"); // End of Program
	
	} // End Of Main
} // End Of Class
