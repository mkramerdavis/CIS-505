/*  Assignment 4.2.6

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the GenericQueue class. //
package Module_4.BowlingShopApp;

// import statement for the LinkedList class. //
import java.util.LinkedList;

/* 
 * GenericQueue class implements a generic queue data structure using a LinkedList.
 */
public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E item) {
        list.addFirst(item);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public int size() {
        return list.size();
    }
}// end of GenericQueue class. //
