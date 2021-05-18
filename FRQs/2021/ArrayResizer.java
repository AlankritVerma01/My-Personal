package FRQs.2021;

public class ArrayResizer {
    
}
public static boolean isNonZeroRow(int[][] array2D , int r)
{
    for ( int i = 0 ; i < array2D[0].length; i++)
    {
        if(array2D[r][i] == 0)
        return false;
    }
    return true;
}


b)
    public static int[][] resize(int[][] array2D)
    {
        int[][] newArray = new int[numNonZeroRows(array2D)][array2D[0].length];

        int newR = 0;
        for(int oldR = 0 ; oldR < array2D.length; oldR++)
        {
            if(isNonZeroRow(array2D, oldR))
            {
                //could copy elements within row instead
                newArray[newR] = array2D[oldR];
                newR++;
            }            
        }
        return newArray;
    }
    