/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : Selectionsort.java
 * Purpose : 
 * Comments : 
 */
/**
 * Selectionsort
 */
import java.util.Arrays;

public class Selectionsort {

    void sort(int arr[])
    {
        int n = arr.length;

        //One by one move boundary of unsorted sybarray
        for(int i = 0 ; i< n-1 ; i++)
        {
            // Find the minimun element in unsorted array
            int min_idx = i;
            for(int j = i+1; j< n ; j++)
            {
                if(arr[j] < arr[min_idx])
                min_idx = j;

                // Swap the found minimun element with the first element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    //Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i< n ; ++i)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // Driver code to test above
    public static void main(String[] args) {
        Selectionsort ob= new Selectionsort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);

        System.out.println("Sorted array");

        ob.printArray(arr);
    }
}