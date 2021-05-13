/** Programmer : Alankrit Verma
 * Date created : Wed May 12 2021
 * File name : BankAccount.java
 * Purpose : 
 * Comments : 
 */
package Part4;
import java.util.*;

public class BankAccount {
    public static double time = 0;
    public static double basic = 0;
    public static double interest = 0;
    public static double total = 0;

    public double timerequired(double basic, double interest, double total) {
        double sum = basic;
        while (sum <= total) {
            sum = sum + sum * 10 / 100;
            time++;
            System.out.println("Year : " + time + ". \t Total $:" + sum);
        }
        return (time);
    }

    public static void display(double d) {
        System.out.println("The time required for this is atleast " + d + " years");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic amount , interest , requied total");
        basic = sc.nextDouble();
        interest = sc.nextDouble();
        total = sc.nextDouble();
        sc.close();

        BankAccount time = new BankAccount();

        display(time.timerequired(basic, interest, total));
    }
}