/**
 * Aaryan Nair
 * September 7th 2025
 * Increment Operators (Video 9)
 * Not too sure if this counts as Video 9, or video 9 extension
 */
package Y10T1;

import java.util.Scanner;

public class Nair_Aaryan_Video09 {

    public static void main(String[] args) {
        Scanner CookieInputScanner = new Scanner(System.in);
        int CookieEaten = 0;
        int CookieInput;

        System.out.println("Do you want to eat a cookie?");
        System.out.println("Type '1' for yes and '2' for no"); // Getting User Input
        CookieInput = CookieInputScanner.nextInt(); // Storing input in variable

        if (CookieInput == 1) { // If statement (if input = 1)
            CookieEaten = CookieEaten + 1; // Long form as you're not supposed to do CookieEaten++ (short way) in GCSE
            System.out.println("Cookies Eaten: " + CookieEaten); // Displaying Cookies Eaten

        } else if (CookieInput == 2) { // elif statement (if user input = 2)
            CookieEaten = CookieEaten + 0;
            System.out.println("No cookies for you! Cookies Eaten: " + CookieEaten);

        } else { // Else statement (if they didn't enter 1 or 2)
            System.out.println("Read the instructions above! I said enter 1, or 2!");
            System.out.println("What did you even input! Input '1' or '2', like I said above!" );
        }

        CookieInputScanner.close(); // Closing scanner
        System.out.println("This program was made by Aaryan Nair on 7/10/25");
    }
}
