/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : Duplicatee.java
 * Purpose : 
 * Comments : 
 */
package Part7;

/**
 * Duplicatee
 */
import java.util.ArrayList;
import java.util.Arrays;

/** This method dyplicates the contents of an Arraytlist
 * @param an ArrayList of Integer values
 * @param the nuu,ber of copies of the original ArrayList
 * @result an Integer ArrayList n*the original size with at least n coppies of each
 */
public class Duplicatee {
    public static ArrayList<Integer> display(ArrayList<Integer> myList, int n)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
            for( int i = 0 ; i < myList.size(); i=i+2)
            {
                temp.add(i, myList.get(i));
            }

        for(Integer value: temp)
        {
            System.out.println(value);
        }
        return temp;
    }    

    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        display(score ,2);
    }
}