/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : mergesort.java
 * Purpose : to merge sort
 * Comments : 
 */
package FRQs.hat;

/**
 * mergesort
 */
public class mergesortt {

    public void mergesort(int[] arrArray, int low , int high)
    {
        int middle;
        if(low<high)
        {
            middle = low + high/2;
            mergesort(arrArray, low, middle);
            mergesort(arrArray, middle, high);
            merge(arrArray , low , middle , high);
        }
    }
}