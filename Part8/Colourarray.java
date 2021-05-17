package Part8;

import java.awt.Color;

/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : Colourarray.java
 * Purpose : 
 * Comments : 
 */
/**
 * Colourarray
 */
public class Colourarray {

    public static int findFirstNonBlueColumn(Color[][] picture)
    {
        for (int col = 0; col < picture[0].length; col++)
        {
            for(int row = 0; row < picture.length; row++)
            {
                if(!picture[row][col].equals(Color.BLUE))
                return col;
            }s
        }
        return -1;
    }
}