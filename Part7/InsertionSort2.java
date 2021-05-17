/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : InsertionSort2.java
 * Purpose : 
 * Comments : 
 */
package Part7;

/**
 * InsertionSort2
 */
public class InsertionSort2 {

    //Function to sort array using insertion sort
    void sort ( int arr[])
    {
        int n = arr.length;
        for (int i = 1 ; i < n ; ++i)
        {
            int key = arr[i];
            int j = i-1;

            // Move elements of arr[0....i-1] that are greater that key, to one position ahead of their current position
            while(j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j=j-i;
            }
            arr[j+i] = key;
        }
    }

    // A utility function to print array fo size n 
    static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0 ; i< n; ++i)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};

        InsertionSort2 ob = new InsertionSort2();
        ob.sort(arr);

        printArray(arr);
    }
}