/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : LeftShift.java
 * Purpose : 
 * Comments : 
 */
package Part6;

/**
 * LeftShift
 */
public class LeftShift {

    public static void main(String[] args) {
        
        String [] words = {"Alpha", "Beta", "Gamma", "delta"};
        int shiftWord = 2;

        for (int count = 0; count < shiftWord; count++);
        {
            String temp = words[0];

            for(int index = 0; index < words.length-1 ; index++)
            {
                words[index] = words[index+1];
            }
            words[words.length-1] = temp;
        }
        for(String word : words)
        {
            System.out.println(word + " ");
        }
    }
}