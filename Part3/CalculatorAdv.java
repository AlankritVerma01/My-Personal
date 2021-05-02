/** Programmer : Alankrit Verma
 * Date created : Thu Apr 29 2021
 * File name : CalculatorAdv.java
 * Purpose : 
 * Comments : 
 */
/**
 * CalculatorAdv
 */
public class CalculatorAdv {
    public void calcAverage(int num1 , double num2) {
        double average = (num1 + num2 ) / 2;
        System.out.println("The average is " + average);
    }

    public void calcAverage(int num1 , double num2, double num3) {
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);
    }

    public static void main(String[] args) {
        CalculatorAdv newAverage = new CalculatorAdv();
        newAverage.calcAverage(20, 15.4); 
        newAverage.calcAverage(5, 8 , 6.4);
    }

        
}