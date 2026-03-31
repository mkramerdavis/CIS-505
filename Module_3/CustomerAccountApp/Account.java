/*  Assignment 3.1.3

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Account class. //
package Module_3.CustomerAccountApp;

// import statements for date handling. //
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 *  Account class represents a bank account with a selection menu.
 */
public class Account {
    
    // Default balance amount. //
    private double balance = 200.00;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
        else {
            System.out.println("  Error: Insufficient funds.");
        }
    }

    public void displayMenu() {
        System.out.println("\n  Account Menu");
        System.out.println("  Enter <D/d> for deposit");
        System.out.println("  Enter <W/w> for withdrawal");
        System.out.println("  Enter <B/b> for balance");
    }

    // Method to get the current transaction date in MM-dd-yyyy format. //
    public String getTransactionDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.now().format(formatter);
    }
} // end of Account class. //