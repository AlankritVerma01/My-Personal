/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : RecusiveBinary.java
 * Purpose : This is a binary search via recursion to find an item in an array
 * Comments : 
 */
package FRQs.hat;

/**
 * RecusiveBinary
 */
public class RecusiveBinary {

    //low = 0 .    high = intArray.length-1
    public static int RecurviveBinarysearch(int[] intArray, int low, int high , int target )
    {
        int mid;

        if ( low > high)
        {
            return -1;
        }
        else
        {
            mid = (high + low)/2;

            if(intArray[mid] < target)
            return RecurviveBinarysearch(intArray , mid+1 , high , target);
            else if ( intArray[mid] > target)
            return RecurviveBinarysearch(intArray, low, mid-1, target);
            
            return mid;            
        }
    }
}