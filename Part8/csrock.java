/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : csrock.java
 * Purpose : 
 * Comments : 
 */

package Part8;
/**
 * csrock
 */
public class csrock {
    public static void main(String[] args) {
        String[][] arr = {{"My", "A"},{"AP","Class"},{"CS", "Rocks!"}};

        for(int col = 0; col < arr[0].length; col++)
        {
            for(int row = 0 ; row < arr.length; row++)
            {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
} 