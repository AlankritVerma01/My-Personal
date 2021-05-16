/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : RightShift.java
 * Purpose : 
 * Comments : 
 */
package Part6;

/**
 * RightShift
 */
public class RightShift {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int [] shifted = new int[numbers.length];
        int shift = 8;
        for(int index = 0; index < numbers.length; index++)
        {
            shifted [ Math.abs((index + shift) % numbers.length)] = numbers[index];
        }

        numbers = shifted;
        for(int num : numbers)
        {
            System.out.println(num + " ");
        }
    }
}