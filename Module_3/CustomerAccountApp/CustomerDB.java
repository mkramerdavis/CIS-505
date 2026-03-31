/*  Assignment 3.1.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the CustomerDB class. //
package Module_3.CustomerAccountApp;

/*
 *  CustomerDB class provides a method to retrieve Customer objects based on an ID.
 */
public class CustomerDB {

    public static Customer getCustomer(Integer id) {

        if (id == 1007) {
            return new Customer("Jennifer Patterson", "8422 Grover Ave.", "Bellevue", "68123");
        } 
        else if (id == 1008) {
            return new Customer("Marc Kramer", "1234 Main St.", "Kearney", "68847");
        } 
        else if (id == 1009) {
            return new Customer("Katie Kramer", "1234 Main St.", "Kearney", "68847");
        } 
        else {
            return new Customer(); // default
        }
    } // end of getCustomer method. //
} // end of CustomerDB class. //