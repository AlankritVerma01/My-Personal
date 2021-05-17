/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : Arraylist3.java
 * Purpose : throwing the array list as parameters
 * Comments : 
 */
package Part7;

/**
 * Arraylist3
 */
import java.util.ArrayList;

public class Arraylist3 {
    public static void main(String[] args) {
        ArrayList<Boolean> question = new ArrayList<Boolean>();
        question.add(true);
        myMethod(question);
        System.out.println(question.get(0));
        System.out.println(question.get(0));
    }

    public static void myMethod(ArrayList arr) {
        if (arr.size() > 0) {
            arr.set(0, "Hello");
        }
    }

}