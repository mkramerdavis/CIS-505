/*  Assignment 5.1.4

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the TestExpenseTracker class. //
package Module_5.ExpenseTracker;

// Import statements for the TestExpenseTracker class. //
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * TestExpenseTracker class is used to test the functionality of the ExpenseTracker.
 */
public class TestExpenseTracker {

    // Method to display the menu options to the user. //
    public static void displayMenu() {
        System.out.println("\n  MENU OPTIONS");
        System.out.println("    1. View Transactions");
        System.out.println("    2. Add Transactions");
        System.out.println("    3. View Expenses");
    }

    // Main method to run the ExpenseTracker application. //
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int choice;
        String continueChoice;

        do {
            displayMenu();

            choice = ValidatorIO.getInt(sc, "\n  Please choose an option: ");

            switch (choice) {

                // Case 1: View Transactions - Reads all transactions from the file and displays them to the user. //
                case 1:
                    ArrayList<Transaction> transactions1 = TransactionIO.findAll();

                    System.out.println("\n  MONTHLY EXPENSES\n");

                    for (Transaction tran : transactions1) {
                        System.out.println(tran);
                        System.out.println();
                    }
                    break;
                
                // Case 2: Add Transactions - Prompts the user to enter transaction details and adds them to the file. //
                case 2:
                    ArrayList<Transaction> transactions2 = new ArrayList<>();
                    String addMore;

                    do {
                        String desc = ValidatorIO.getString(sc, "\n  Enter the description: ");
                        double amt = ValidatorIO.getDouble(sc, "  Enter the amount: ");

                        Transaction tran = new Transaction();
                        tran.setDescription(desc);
                        tran.setAmount(amt);
                        transactions2.add(tran);

                        addMore = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");

                    } while (addMore.equalsIgnoreCase("y"));

                    TransactionIO.bulkInsert(transactions2);
                    System.out.println();
                    break;
                
                // Case 3: View Expenses - Reads all transactions from the file, calculates the total expenses, and displays it to the user. //
                case 3:
                    ArrayList<Transaction> transactions3 = TransactionIO.findAll();

                    double total = 0;

                    for (Transaction tran : transactions3) {
                        total += tran.getAmount();
                    }

                    System.out.printf("\n  Your total monthly expenses: $%,6.2f", total);
                    System.out.println("\n");
                    break;
            }

            continueChoice = ValidatorIO.getString(sc, "  Continue? (y/n): ");

        } while (continueChoice.equalsIgnoreCase("y"));

        System.out.println("\n  Program terminated by the user...");
        sc.close();
    } // end of main method. //
} // end of TestExpenseTracker class. //
