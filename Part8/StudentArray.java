package Part8;
/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : StudentArray.java
 * Purpose : 
 * Comments : 
 */
/**
 * StudentArray
 */
public class StudentArray {
    public static void main(String[] args)
    {
        int grades[][] = { { 100, 85, 95, 96}, {98, 100, 100, 95}, { 92, 100, 98, 100}, { 100, 95, 97, 99},
                                                  { 100, 100 , 1000 , 70} , { 100, 98, 99, 98}, { 100, 94, 100, 93}};
        int mark92 = grades[2][0];
        int mark70 = grades[4][3];
        int mark93 = grades[6][3];
        int first = grades[0][0];
        int last = grades[6][3];
        // int last = grades.[grades.length -1 ][ grade[0].length-1]
        grades[5][2] = grades[5][2] + 1;
        
        for( int [] row : grades)
        {
            for(int letter: row)
            {
                System.out.print(letter+  "\t");
            }
            System.out.println();
        }

        //row major order
        for(int [] row : grades)
        {
            for(int letter : row)
            {
                System.out.print(letter);
            }
            System.out.println();
        }

        // Column major order
        for(int col = 0 ;col < grades[0].length; col++)
        {
            for(int row = 0 ; row < grades.length ; row++)
            {
                System.out.print(grades[row][col]);
            }
            System.out.print("\t");
        }
        System.out.println();
    }
}