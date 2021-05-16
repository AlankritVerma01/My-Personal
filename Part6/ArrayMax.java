/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : ArrayMax.java
 * Purpose :
 * Comments :
 */
package Part6;

/**
 * ArrayMax
 */
public class ArrayMax {

    private double findMax(double [] values)
    {
        double max = values[0];

        for(int index = 1 ; index < values.length ; index++)
        {
            if(values[index] > max)
            max = values[index];
        }

        return max;
    }

    private double findMin(int [] values)
    {
        int min = Integer.MAX_VALUE;

        for(int currentValue : values)
        {
            if(currentValue < min)
            {
                min = currentValue;
            }
        }
        return min;
    }
}