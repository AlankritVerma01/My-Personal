package Part4;

/** Programmer : Alankrit Verma
 * Date created : Wed May 12 2021
 * File name : WhileLoop.java
 * Purpose : This is the basic loop which desplays the digits from the input to 0 with a difference of 4
 * Comments : nota
 */
import java.util.*;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number");
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.print(n + "\t");
            n -= 4;
     
        }
        sc.close();
        
    }
}