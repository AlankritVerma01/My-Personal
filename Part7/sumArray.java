package Part7;
/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : sumArray.java
 * Purpose : 
 * Comments : 
 */
/**
 * sumArray
 */
import java.util.ArrayList;
public class sumArray {

    private int findSum(ArrayList<Integer> values)
    {
        int sum = 0;

        for(int val : values)
        {
            sum += val;
        }
        return sum;
    }
}