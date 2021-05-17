package Part7;
/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : Delimeters.java
 * Purpose :   2019 FRQ Q3  array lists
 * Comments : 
 */
import java.util.ArrayList;
public class Delimeters
{
    /**The open and class delimetes */
    private String openDel;
    private String closeDel;

    /** Constructs a Delimeteres object where open is the opend Delimetere and cloase is the close Delimeter
    * close Delimeter
    *
    * Precondition - open and close are not empty
    */

    public Delimeters(String open , String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Return and ArrayList of delimetes from the array tokens as described in part(a) */
    public ArrayList<String> getDelimetersList(String[] tokens)
    {
        ArrayList<String> d = new ArrayList<String>();
        for(String str : tokens)
        {
            if(str.equals(openDel) || str.equals(closeDel))
            {
                d.add(str);
            }
        }
        return d;
    }

    /** Return true if the delimetes are balanced and false otherwise as described in part(b)
    * Precondition-- Delimeter contain only valid open and close delimetes
    */
    public boolean isBalanced(ArrayList<String> delimetes)
    {
        int openCount = 0;
        int closeCount = 0;

        for(String str : delimetes)
        {
            if(str.equals(openDel))
            {
                openCount++;
            }

            else
            closeCount++;

            if(closeCount > openCount)
            {
                return false;
            }
        }

        if(openCount == closeCount)
        return true;
        else 
        return false;
    }

    // There may be instance variables , constructors , and methods that are not shown
}
