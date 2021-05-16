/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : ArrayList1.java
 * Purpose : 
 * Comments : 
 */
package Part7;

import java.util.ArrayList;

/**
 * ArrayList1
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<Boolean> a1 = new ArrayList<Boolean>();
       // ArrayList<Turtles> a2 = new ArrayList<Turtle>();
        ArrayList<String>  a3= new ArrayList<String>(10);
    }

    /** int size ( ) -- Retruns the numbers of elements in the list.
     * boolena add(E obj) -- Appends onj to the end of the list , retruns true
     * void add(int index , E obj) -- inserts onj at position inddex(0<== index <= size), 
     * --moving the elements at posiion index and higer to right (adds 1 to their indices) adds 1 to the size
     * E get(int index) -- Returns the element at position index in the list
     * E set(int, E obj) --Replaces teh element at posiont index with obj; returns the element formerly at position insex
     * E remove( index index) -- Removes elements from position index, moving elements at posion index+1 and higher left(Substracts 1 form thier indices)
     * and substracts 1 form the size, returns the elements formerly at position index.
     */
}