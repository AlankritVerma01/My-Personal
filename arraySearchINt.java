
/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : arraySearchINt.java
 * Purpose : 
 * Comments : 
 */
/**
 * arraySearchINt
 */
import java.util.Arrays;
import java.awt.print.Book;
import java.util.ArrayList;
public class arraySearchINt {

    public int whereIsMyNumber(int magicNo , int[] myNumbers)
    {
        for(int index = 0 ; index < myNumbers.length; index++)
        {
            if(myNumbers[index] == magicNo)
            {
                return index;
            }
        }
        return -1;
    }

    public int where(double maginNumer, ArrayList<Double> realNumbers, double delta)
    {
        for (int index= 0; index< realNumbers.size() ; index++)
        {
            if(Math.abs(maginNumer - realNumbers.get(index)) < delta)
            {
                return index;
            }
        }
        return -1;
    }

    public int findTheWord(String searchedPhrase, ArrayList<Book> myBook)
    {
       for(int index =0 ; index< myBook.size(); index++)
       {
        Book currentBook = myBook.get(index);
        String currentPhrase = currentBook.getDescription();
        if(currentPhrase.equals(searchedPhrase))
        {
            return index;
        }
       }

        return -1;
    } 
}