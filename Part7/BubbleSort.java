/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : BubbleSort.java
 * Purpose : 
 * Comments : 
 */
package Part7;

/**
 * BubbleSort
 */
public class BubbleSort {

    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0 ; i < n-1 ; i++)
        {
            for (int j = 0; j< n-i-1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // Swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0 ; i < n ; ++i)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    /*Driver method to test above*/
    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array - ");
        ob.printArray(arr);
    }
}