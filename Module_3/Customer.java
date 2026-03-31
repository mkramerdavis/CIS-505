/*  Assignment 3.1.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Customer class. //
package Module_3;

/*
 *  Customer class represents a customer with name, address, city, and zip code.
 */
public class Customer {

    private String name;
    private String address;
    private String city;
    private String zip;

    // Default constructor. //
    public Customer() {
        this.name = "";
        this.address = "";
        this.city = "";
        this.zip = "";
    }

    // Argument constructor. //
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    // Getters. //
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
    public String getZip() { return zip; }

    // toString() method. //
    @Override
    public String toString() {
    return "  Name: " + name + "\n" +
           "  Address: " + address + "\n" +
           "  City: " + city + "\n" +
           "  Zip: " + zip;
    }
} // end of Customer class. //