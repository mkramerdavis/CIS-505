/*  Assignment 4.2.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Ball class. //
package Module_4.BowlingShopApp;

/*
 *  Ball class represents a ball product in the bowling shop.
 */
public class Ball extends Product {

    // default value for ball color. //
    private String color = "";

    // default constructor. //
    public Ball() {}

    // getter and setter methods for ball color. //
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    // toString method to display ball information. //
    @Override
    public String toString() {
        return super.toString() + "\n  Color: " + color + "\n";
    }// end of toString method. //
}// end of Ball class. //