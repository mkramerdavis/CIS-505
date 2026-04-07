/*  Assignment 4.2.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Product class. //
package Module_4.BowlingShopApp;

/*
 *  Product class represents a product in the bowling shop.
 */
public class Product {

    // default values for product attributes. //
    private String code = "";
    private String description = "";
    private double price = 0;

    // default constructor. //
    public Product() {}

    // getter and setter methods for product attributes. //
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // toString method to display product information. //
    @Override
    public String toString() {
        return "  Product code: " + code + "\n" +
               "  Description: " + description + "\n" +
               String.format("  Price: $%,6.2f", price);
    }// end of toString method. //
}// end of Product class. //