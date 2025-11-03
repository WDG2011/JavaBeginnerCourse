/**
 * Aaryan Nair
 * October 27th 2025
 * Extension of Video 11 (Logical Operators)
 */

package Y10T1;
import java.util.Scanner;

public class Nair_Aaryan_Video11Extension {

    public static void main(String[] args) {
        int cartValue, memberPoints;

        Scanner input = new Scanner(System.in); // Creating scanner

        System.out.print("Enter your cart value: "); // Asking for input (cart value)
        cartValue = input.nextInt(); // Storing the input in a variable

        System.out.print("Enter your member points: "); // Asking for member points
        memberPoints = input.nextInt(); // Storing the input in a variable

        if (cartValue >= 100 && memberPoints > 50) { // If statement (to see if eligible)
            System.out.println("✅ Discount applied!");
        } else {
            System.out.println("❌ No Discount.");
            System.out.println("Make sure your cart is worth more than $100 and you have more than 50 points.");
        }

        System.out.println("\nThis program was made by Aaryan Nair on 27/10/25"); // Using "\n" to insert line break
        input.close();
    }
}
