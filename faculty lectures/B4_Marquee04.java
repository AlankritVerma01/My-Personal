/**
 * Doing Marquee02 , without changing the value of s
 */
public class B4_Marquee04
{
    public static void  main (String[]args)
    {
        String s = "ABCDEFGHI";
        boolean done = false;
        while (!done)
    
        {
            for(int i=0; i<s.length()-4 ; i++)
            {
                System.out.println(s.substring(i,i+5));
            }
            done = s.substring(0,1).equals("A");
        }
    }

}
