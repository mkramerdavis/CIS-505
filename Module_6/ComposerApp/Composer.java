/*  Assignment 6.2.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the Composer class. //
package Module_6.ComposerApp;

/* 
 * Composer class represents a composer with an id, name, and genre.
 */
public class Composer {

    private int id;
    private String name;
    private String genre;

    // No-arg constructor //
    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    // Argument constructor //
    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    // Getters //
    public int getId() { return id; }
    public String getName() { return name; }
    public String getGenre() { return genre; }

    // Setters //
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "  Id: " + id +
               "\n  Name: " + name +
               "\n  Genre: " + genre;
    } // End of toString method. //
} // End of Composer class. //
