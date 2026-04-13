/*  Assignment 5.1.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the Transaction class. //
package Module_5.ExpenseTracker;

// Import statements for the Transaction class. //
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* 
 * Transaction class is used to represent a single expense transaction.
 */
public class Transaction {

    private String date;
    private String description;
    private double amount;

    // No-arg constructor. //
    public Transaction() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        this.date = LocalDate.now().format(formatter);
        this.description = "";
        this.amount = 0;
    }

    // Argument constructor. //
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    } 

    // Getters & Setters //
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "  Date: " + date + "\n" +
               "  Description: " + description + "\n" +
               "  Amount: $" + amount;
    } // end of toString method. //
} // end of Transaction class. //
