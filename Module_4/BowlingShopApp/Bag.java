/*  Assignment 4.2.3

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Bag class. //
package Module_4.BowlingShopApp;

/*
 *  Bag class represents a bag product in the bowling shop.
 */
public class Bag extends Product {

    // default value for bag type. //
    private String type = "";

    // default constructor. //
    public Bag() {}

    // getter and setter methods for bag type. //
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // toString method to display bag information. //
    @Override
    public String toString() {
        return super.toString() + "\n  Type: " + type + "\n";
    }// end of toString method. //
}// end of Bag class. //