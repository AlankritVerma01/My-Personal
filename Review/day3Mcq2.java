/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : day3Mcq2.java
 * Purpose : 
 * Comments : 
 */
package Review;

/**
 * day3Mcq2
 */
public class day3Mcq2 {

    public void doSome(int [] arr, int lim)
    {
        int v = 0;
        int k = 0;
        int i = 1;
        int j = 1;
        while( k < arr.length && arr[k] < lim)
        {
            if(arr[k] > v)
            {
                v = arr[k]; // Statement S
                System.out.println("printed S " + i);
                i++;
            }
            k++; //Statement T
            System.out.println("Printed T "+ j);
            j++;
        }
    }

    public static void main(String[] args) {
        day3Mcq2 o = new day3Mcq2();
        int [] arr = {1,2,3,4,5};
        o.doSome(arr, 7);
    }
}