package Part4;
/** Programmer : Alankrit Verma
 * Date created : Thu May 13 2021
 * File name : looppattern1.java
 * Purpose : 
 * Comments : 
 */
public class looppattern1
{
    public static void main(String[] args) {
        for (int outer = 4 ; outer >=1 ; outer --)
        {
            for (int inner = outer ; inner > 0; inner--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}