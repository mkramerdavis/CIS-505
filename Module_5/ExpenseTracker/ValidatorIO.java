/*  Assignment 5.1.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the ValidatorIO class. //
package Module_5.ExpenseTracker;

// Import statements for the ValidatorIO class. //
import java.util.Scanner;

/* 
 * ValidatorIO class is used to validate input from the user.
 */
public class ValidatorIO {

    // Method to get an integer value from the user with validation. //
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n  Exception: Error! Invalid integer value.");
            }
            sc.nextLine();
        }
        return input;
    } // end of getInt method. //

    // Method to get a double value from the user with validation. //
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n  Exception: Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    } // end of getDouble method. //

    // Method to get a string value from the user with validation. //
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    } // end of getString method. //
} // end of ValidatorIO class. //
