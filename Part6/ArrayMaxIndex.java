/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : ArrayMaxIndex.java
 * Purpose : 
 * Comments : 
 */
package Part6;

/**
 * ArrayMaxIndex
 */
public class ArrayMaxIndex {

    private int findMax(double [] values)
    {
        double max = values [0];
        int MaxIndex = 0;

        for(int index = 1 ; index < values.length; index++)
        {
            if(values[index] > max)
            {
                max = values[index];
                MaxIndex = index;
            }
        }
       return MaxIndex;
    }
}