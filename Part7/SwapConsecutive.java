/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : SwapConsecutive.java
 * Purpose : to swap 2 consecutive elements in a Array List
 * Comments : 
 */
package Part7;

/**
 * SwapConsecutive
 */
import java.util.ArrayList;
import java.util.Arrays;


public class SwapConsecutive {

    /**
     * This method swaps consecutive items in an ArrayList an ArrayList of Doubles
     */
    public static void swapConsecutive(ArrayList<Double> myList) 
    {
        for(int i = 0; i < myList.size()-1; i=i+2)
        {
            double temp = myList.get(i);
            myList.set(i, myList.get(i+1));
            myList.set(i+1, temp);
            System.out.println("i am working");
        }

        for(double i : myList)
        {
            System.out.println(i);
        }
    }

    
     /**public static void swapConsecutive(ArrayList<Double> myList) {
        for(int i = myList.size()-1; i >= 0 ; i=i-2)
        {
            double temp = myList.get(i-1);
            myList.set(i-1, myList.get(i));
            myList.set(i, temp);
            System.out.println("i am working");
        }

        for(double i : myList)
        {
            System.out.println(i);
        }
    }
    */

    public static void main(String[] args) {
        ArrayList<Double> score = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0));
        swapConsecutive(score);
    }
}