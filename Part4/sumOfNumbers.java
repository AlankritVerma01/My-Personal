package Part4;

/** Programmer : Alankrit Verma
 * Date created : Wed May 12 2021
 * File name : sumOfNumbers.java
 * Purpose : 
 * Comments : 
 */
import java.util.*;

public class sumOfNumbers {
    public static int a = 0;
    public static int b = 0;
    public static double sum = 0;

    public double calculate(double a, double b) {
        int i = 1;
        while (i <= a) {
            sum = (sum + b);
            System.out.println("The sum after iteration " + i + " is = " + sum);
            i++;
        }
        return sum;
    }

    public void display(double sum) {
        System.out.println("\nthe total final sum now is" + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The number - total number ,  to be multiplied");
        a = sc.nextInt();
        b = sc.nextInt();

        sumOfNumbers numbers = new sumOfNumbers();
        numbers.display(numbers.calculate(a, b));
        System.out.println("the project completed");
        sc.close();
    }
}