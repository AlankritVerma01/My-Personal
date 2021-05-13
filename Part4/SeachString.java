/** Programmer : Alankrit Verma
 * Date created : Thu May 13 2021
 * File name : SeachString.java
 * Purpose : 
 * Comments : 
 */
package Part4;

/**
 * SeachString
 */
public class SeachString 
{
    public static void main(String[] args) 
    {
        String word = "Sunflower";
        String sub = "er";
        boolean found = false;
        for( int i = 0; i<word.length()-sub.length(); i++)
        {
            String portion = word.substring(i, i+sub.length());
            if(portion.equals(sub))
            found = true;
        }

        if(found)
        System.out.println("We found the missing smaller String");
        else
        System.out.println("We did not find the smaller String!");
    }   
}