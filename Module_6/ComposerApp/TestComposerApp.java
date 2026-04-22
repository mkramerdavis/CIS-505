/*  Assignment 6.2.5

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the TestComposerApp class. //
package Module_6.ComposerApp;

// Import statements for the TestComposerApp class. //
import java.util.List;
import java.util.Scanner;

/* 
 * TestComposerApp class serves as the main entry point for the Composer App, 
 * allowing users to interact with the composer data through a console-based menu.
 */
public class TestComposerApp {
    
    // Method to display the menu options to the user. //
    public static void displayMenu() {
        System.out.println("\n  MENU OPTIONS");
        System.out.println("    1. View Composers");
        System.out.println("    2. Find Composer");
        System.out.println("    3. Add Composer");
        System.out.println("    4. Exit");
    }

    // Method to get an integer input from the user. //
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print(prompt);

            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            }
            else {
                System.out.println("\n  Error! Invalid integer.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    // Method to get a string input from the user. //
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    // Main method to run the Composer App. //
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemComposerDao dao = new MemComposerDao();

        int choice;

        // Display welcome message and menu options to the user. //
        System.out.println("\n  Welcome to the Composer App");
        
        do {
            displayMenu();
            
            choice = getInt(sc, "\n  Please choose an option: ");
            
            switch (choice) {

                // Case 1: View Composers - Retrieves all composers from the in-memory list and displays their details to the user. //
                case 1:
                    List<Composer> composers = dao.findAll();

                    System.out.println("\n\n  --DISPLAYING COMPOSERS--");

                    for (Composer c : composers) {
                        System.out.println(c);
                        System.out.println();
                    }
                    break;
                
                // Case 2: Find Composer - Prompts the user to enter a composer id and displays the corresponding composer details if found. //
                case 2:
                    int id = getInt(sc, "\n  Enter an id: ");

                    Composer composer = dao.findBy(id);

                    if (composer != null) {
                        System.out.println("\n  --DISPLAYING COMPOSER--");
                        System.out.println(composer);
                    } else {
                        System.out.println("\n  No composer with that id.");
                    }
                    break;
                
                // Case 3: Add Composer - Prompts the user to enter composer details and adds them to the in-memory list. //
                case 3:
                    int newId = getInt(sc, "\n  Enter an id: ");
                    String name = getString(sc, "  Enter a name: ");
                    String genre = getString(sc, "  Enter a genre: ");

                    Composer newComposer = new Composer(newId, name, genre);
                    dao.insert(newComposer);
                    break;
                
                // Case 4: Exit - Terminates the program. //
                case 4:
                    break;

                default:
                    System.out.println("\n  Error! Invalid option.");
            }

        } while (choice != 4);

        System.out.println("\n  Program terminated by the user...");
        sc.close();
    } // End of main method. //
} // End of TestComposerApp class. //