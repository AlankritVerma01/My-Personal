package Part4;
/** Programmer : Alankrit Verma
 * Date created : Thu May 13 2021
 * File name : reversedString.java
 * Purpose : 
 * Comments : 
 */
import java.util.*;

public class reversedString
{
    public static String name = new String("");
    public static String reversed = new String("");
    

    public String reversal(String n)
    {
        int length = n.length();
        for(int i = length-1 ; i >=0 ; i--)
        {
            reversed = reversed + n.substring(i,i+1);
        }
        return(reversed);
    }
    public String reversal2(String n)
    {
        int  length = n.length();
        for( int i = 0; i < length ; i++)
        {
            reversed = name.substring(i , i +1) + reversed;
        }
        return(reversed);
    }

    public void display(String n)
    {
        System.out.println("The reversed string is = " + n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string required");
        name = sc.nextLine();
        reversedString ob = new reversedString();
        ob.display(ob.reversal2(name)); 
        sc.close();           
    }
}