/*  Assignment 4.2.7

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the TestBowlingShopApp class. //
package Module_4.BowlingShopApp;

// import statements for the Scanner class. //
import java.util.Scanner;

/* 
 * TestBowlingShopApp class is used to test the functionality of the BowlingShopApp.
 */
public class TestBowlingShopApp {

    public static void displayMenu() {
        System.out.println("\n  MENU OPTIONS");
        System.out.println("    1. <b> Bowling Balls");
        System.out.println("    2. <a> Bowling Bags");
        System.out.println("    3. <s> Bowling Shoes");
        System.out.println("    4. <x> Exit");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            System.out.print("\n  Please choose an option: ");
            choice = input.nextLine();

            if (!choice.equalsIgnoreCase("x")) {

                GenericQueue<Product> products = ProductDB.getProducts(choice);
                
                if (products.size() > 0) {
                    System.out.println("\n  --Product Listing--");
                
                    while (products.size() > 0) {
                        System.out.println(products.dequeue());
                    }
                }
            }

        } while (!choice.equalsIgnoreCase("x"));

        System.out.println("\n\n  End of line...");
        input.close();
    }// end of main method. //
}// end of TestBowlingShopApp class. //