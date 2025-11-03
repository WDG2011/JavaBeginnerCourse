/**
 * Aaryan Nair
 * November 3rd 2025
 * Switch Statement (Video 12 Extension)
 */
package Y10T1;

import java.util.Scanner;

public class Nair_Aaryan_Video12Extension {
	
	public static void main(String[] args) {
		Scanner ageInput = new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age = ageInput.nextInt();
		
		switch (age) { // Switch statement takes whatever variable is inside it and does the following
		case 1: // What to do when age = 1
			System.out.println("You can crawl");
			break;
		case 2: // What to do when age = 2
			System.out.println("You can talk");
			break;
		case 3: // What to do when age = 3
			System.out.println("You can get in trouble");
			break;
		case 5: // Added case for starting school
			System.out.println("You are starting school");
			break;
		case 13: // Added case for becoming a teenager
			System.out.println("Welcome to your teenage years!");
			break;
		case 18: // Added case for becoming an adult
			System.out.println("You are now an adult");
			break;
		default: // What to do when age is something else
			System.out.println("You are " + age + " years old!");
			break;
		}
		 ageInput.close(); // Closing scanner
		 System.out.println("This program was made by Aaryan Nair on 3/11/25");
 
	} // End of main

} // End of class
