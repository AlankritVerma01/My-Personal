/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : percentageTrue2d.java
 * Purpose : Return the percentage of the true elements in the given 2d arry
 * Comments :
 */
package Part7;

/**
 * percentageTrue2d
 */
public class percentageTrue2d {

    public static double percentTrue(boolean[][] matrix)
    {
        int total = matrix.length * matrix[0].length;
        int truth = 0;
        double percent = 0;

        for( int row = 0 ; row < matrix.length; row++)
        {
            for(int col = 0 ; col < matrix[0].length; col++)
            {
                if ( matrix[row][col])
                truth++;
            }
        }
        percent = truth/total;
        return percent;
    }
}
