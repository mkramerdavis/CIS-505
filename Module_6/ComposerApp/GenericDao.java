/*  Assignment 6.2.2

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// Package declaration for the GenericDao interface. //
package Module_6.ComposerApp;

// Import statements for the GenericDao interface. //
import java.util.List;

/* 
 * GenericDao interface defines the basic CRUD operations for a generic type E with a key of type K.
 */
public interface GenericDao<E, K> {

    List<E> findAll();

    E findBy(K key);

    void insert(E entity);
} // End of GenericDao interface. //