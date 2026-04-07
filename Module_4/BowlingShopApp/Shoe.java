/*  Assignment 4.2.4

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Shoe class. //
package Module_4.BowlingShopApp;

/*
 *  Shoe class represents a shoe product in the bowling shop.
 */
public class Shoe extends Product {

    // default value for shoe size. //
    private double size = 0;

    // default constructor. //
    public Shoe() {}

    // getter and setter methods for shoe size. //
    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    // toString method to display shoe information. //
    @Override
    public String toString() {
        return super.toString() + "\n  Size: " + size + "\n";
    }// end of toString method. //
}// end of Shoe class. //