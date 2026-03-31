/*  Assignment 3.1.4

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the TestCustomerAccountApp class. //
package Module_3;

// import statements for Scanner. //
import java.util.Scanner;

/*
 * Test application to demonstrate the functionality of Customer, CustomerDB, and Account classes.
 */
public class TestCustomerAccountApp {

    public static void main(String[] args) {
        
        // Create a Scanner object for user input. //
        Scanner input = new Scanner(System.in);
        
        // Display welcome message. //
        System.out.println("\n  Welcome to the Customer Account App.");

        // Get customer. //
        System.out.print("\n  Enter customer ID:\n    ex: 1007, 1008, 1009>: ");
        int id = input.nextInt();
        input.nextLine();

        // Retrieve customer from CustomerDB and create an Account object. //
        Customer customer = CustomerDB.getCustomer(id);
        Account account = new Account();

        // Variables for menu choice and loop control. //
        String choice;
        String continueChoice = "y";

        // Main menu loop. //
        do {
            account.displayMenu();
            System.out.print("    Enter option>: ");
            choice = input.nextLine();

            switch (choice.toLowerCase()) {
                case "d":
                    System.out.print("\n  Enter deposit amount: ");
                    double depositAmt = input.nextDouble();
                    input.nextLine();
                    account.deposit(depositAmt);
                    break;

                case "w":
                    System.out.print("\n  Enter withdrawal amount: ");
                    double withdrawAmt = input.nextDouble();
                    input.nextLine();
                    account.withdraw(withdrawAmt);
                    break;

                case "b":
                     System.out.printf("\n  AccountBalance: $%,6.2f\n", account.getBalance());
                    break;

                default:
                    System.out.println("\n  Error: Invalid Option.");
            }
            System.out.print("\n  Continue? (y/n): ");
            continueChoice = input.nextLine();
        }  while (continueChoice.equalsIgnoreCase("y"));

        // Customer details and final balance display. //
        System.out.println("\n  --Customer Details--");
        System.out.println(customer.toString());

        System.out.printf("\n  Balance as of %s: $%,6.2f\n\n  End of line...", account.getTransactionDate(), account.getBalance());

        input.close();
    }// end of main method. //
}// end of TestCustomerAccountApp class. //