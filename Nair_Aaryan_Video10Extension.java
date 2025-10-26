/**
 * Aaryan Nair
 * September 8th 2025
 * If Statements (Video 10)
 */
package Y10T1;

import java.util.Scanner;

public class Nair_Aaryan_Video10Extension {

    public static void main(String[] args) {
        Scanner scoreInput = new Scanner(System.in); // Creating the scanner
        int marks, totalmarks; // Creating 2 integer variables
        double marksperc; // Creating a double (for marks as a percentage)

        System.out.println("Enter the marks that you got"); // Prompting user for input
        marks = scoreInput.nextInt(); // Storing user input in a variable

        System.out.println("Enter the max possible marks"); // Prompting user for input
        totalmarks = scoreInput.nextInt(); // Storing user input in a variable

        marksperc = ((double) marks / totalmarks) * 100; // Calculating the user's marks as a percentage
        System.out.printf("You scored %.1f%%\n", marksperc); // Rounding / Formating the user's marks and displaying

        if (marksperc > 100) { // If statement if they got over 100%
            System.out.println("How did you even get over 100%! Anyways, great work!");
       
        } else if (marksperc == 100) { // If statement if they got a perfect score
            System.out.println("Perfect score! That's insane 🔥");
        
        } else if (marksperc >= 90) { // If statement if they got 90% or above
            System.out.println("Wow, you did great! 90% or higher is an amazing mark 😁");
       
        } else if (marksperc >= 50) { // If statement if they got a 50 or above
            System.out.println("Good work!");
     
        } else if (marksperc < 0) { // If statement if they get a negative score
            System.out.println("Something's off...");
      
        } else { // If they enter anything else
            System.out.println("Enter a proper score!");
        }

        scoreInput.close(); // Closing the scanner to avoid resource leaks
        System.out.println("This program was made by Aaryan Nair on 21/10/25");
        
        
    } // End of main
} // End of class
