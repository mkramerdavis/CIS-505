/*  Assignment 6.2.4

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the MemComposerDao class. //
package Module_6.ComposerApp;

// Import statements for the MemComposerDao class. //
import java.util.ArrayList;
import java.util.List;

/* 
 * MemComposerDao class implements the ComposerDao interface using an in-memory list to store composer data.
 */
public class MemComposerDao implements ComposerDao {

    private List<Composer> composers;

    // Constructor with 5 default composers
    public MemComposerDao() {
        composers = new ArrayList<>();

        composers.add(new Composer(1007, "Ludwig van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    @Override
    public List<Composer> findAll() {
        return composers;
    } // End of findAll method. //

    @Override
    public Composer findBy(Integer key) {
        for (Composer composer : composers) {
            if (composer.getId() == key) {
                return composer;
            }
        }
        return null;
    } // End of findBy method. //

    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    } // End of insert method. //
}// End of MemComposerDao class. //