
public class Calculator {
    public void calcAverage(int num1, double num2){
        double average = (num1 + num2)/2;
        System.out.println("The average is " + average);
    }

    public static void main(String[] argsStrings){
        Calculator newAverage = new Calculator();
        newAverage.calcAverage(20, 15.4);
    }
    
}
