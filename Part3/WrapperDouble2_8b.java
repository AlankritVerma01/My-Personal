/** Programmer : Alankrit Verma
 * Date created : Tue May 11 2021
 * File name : WrapperDouble2_8b.java
 * Purpose : Just for the code with the teacher in the wrapper class 
 * Comments : nota
 */
package Part3;

import java.lang.*;

class wrapperDouble2_8b {
    public static void main(String[] args) {
        Double score1 = new Double(145.00); // Creating an object for wrpper class double
        System.out.println("Score1 = " + score1); // printing the object

        Double score2 = new Double(165.00);
        Double score3 = new Double(185.00);
        Double MeanScore = new Double((score1 + score2 + score3) / 3); // calculating the mean sore in Double

        System.out.println("The Double meanscore = " + MeanScore); // Displaying the Double value of mean score

        double score = MeanScore.doubleValue(); // initialising the Double mean score value to primitive double mean
                                                // score
        System.out.println("The double meanscore = " + score); // printing
    }
}