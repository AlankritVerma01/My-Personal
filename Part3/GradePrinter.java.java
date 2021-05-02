/** Programmer : Alankrit Verma
 * Date created : Thu Apr 29 2021
 * File name : GradePrinter.java.java
 * Purpose : To check the grade of a chile
 * Comments : 
 */
class GradePrinter
{
    public void printInfo(String name, double grade) {
        System.out.println(name + " has grade of " + grade);
    }

    public static void main(String[] args) {
        GradePrinter student1 = new GradePrinter();
        student1.printInfo("Jamaila", 82.5);
    }
}