/*  Assignment 5.1.3

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the TransactionIO class. //
package Module_5.ExpenseTracker;

// Import statements for the TransactionIO class. //
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
 * TransactionIO class is used to handle input/output operations for Transaction objects.
 */
public class TransactionIO {

    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    // Method to insert a single transaction into the file. //
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

        PrintWriter output = null;

        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(file, true));
        } 
        else {
            output = new PrintWriter(file);
        }

        for (Transaction tran : transactions) {
            output.println(tran.getDate());
            output.println(tran.getDescription());
            output.println(tran.getAmount());
        }

        output.close();
    } // end of bulkInsert method. //

    // Method to find all transactions in the file and return them as an ArrayList. //
    public static ArrayList<Transaction> findAll() throws IOException {

        ArrayList<Transaction> transactions = new ArrayList<>();

        if (!file.exists()) {
            return transactions;
        }

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
            String date = sc.nextLine();
            String description = sc.nextLine();
            double amount = Double.parseDouble(sc.nextLine());

            Transaction tran = new Transaction(date, description, amount);
            transactions.add(tran);
        }

        sc.close();
        return transactions;
    } // end of findAll method. //
} // end of TransactionIO class. //
