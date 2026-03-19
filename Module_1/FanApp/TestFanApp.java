/*  Assignment 1.3.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026
    
*/

// package declaration for the TestFanApp class. //
package Module_1.FanApp;

/*
 *  Test application for the Fan class.
 */
public class TestFanApp {

    /*
     * Main method to test Fan objects
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create fan using default constructor. //
        Fan fan1 = new Fan();

        // Create fan using argument constructor. //
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");

        // Display both fans. // 
        System.out.println("\n" + fan1.toString());

        System.out.println("\n" + fan2.toString());
    }// end main method. //
}// end of class TestFanApp. //