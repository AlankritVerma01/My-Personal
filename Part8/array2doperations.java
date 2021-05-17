/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : Search2darray.java
 * Purpose : 
 * Comments : 
 */
package Part8;

/**
 * Search2darray
 */
public class array2doperations 
{
    //To search the 2d array for a particular value
    public boolean search(String[][] chart, String name)
    {
        for ( int r = 0; r <chart.length; r++)
        {
            for ( int c = 0 ; c < chart[0].length ; c++)
            {
                if(chart[r][c].equals(name))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String findLongest(String [] [] chart)
    {
        String longest = char[0][0];
        for ( String[] row: chart)
        {
            for(String item : row)
            {
                if(item.length() > longest.length())
                {
                    longest = item;
                }
            }
        }
        return longest;
    } 
}