public class B_1Marquee01
{
    public static void main(String[]args)
    {
         String s = "ABCDE";
         int i=0;
         while (i<5)
         {
             System.out.println(s);
             s= s.substring(1) + s.substring(0,1);
             i++;
         }
    
    }
}