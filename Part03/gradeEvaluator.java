/** Programmer : Alankrit Verma
 * Date created : Tue May 11 2021
 * File name : gradeCalculator.java
 * Purpose : This is used to calculate the grade of a student
 * Comments : just the else if statement is used
 */
package Part03;

import java.util.*;

public class gradeEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // setting up the scanner class
        System.out.println("Enter your age"); // asking the user for his age
        int age = sc.nextInt(); // storing the age from the user in the variable age

        if (age >= 18) // check if age greater or equal to 18
        {
            System.out.println("You can vote");
        } else if (age > 17) {
            System.out.println("You have 1 year left");
        } else if (age > 16) {
            System.out.println("You have 2 years left ");
        } else
            System.out.println("Dont dream of driving , you are very young");
        sc.close();
    }
}