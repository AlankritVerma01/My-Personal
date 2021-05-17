/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : transverserEnhanced.java
 * Purpose : 
 * Comments : 
 */
package Part7;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * transverserEnhanced
 */
public class transverserEnhanced{
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<Integer>(Arrays.asList(80,54,33,23,32,111));

        for(int score : grades)
        {
            if(score > 70)
            {
                System.out.println(score);
            }
        }

    }
}
    


