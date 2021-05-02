public class B2_Marquqq02 {
    public static void main(String[]args)
    {
        String s = "ABCEFGHI";
        boolean done = true;
        while (done)
        {
            System.out.println(s.substring(0,5));
            s = s.substring(1) + s.substring(0,1);

            done = !(s.substring(0,1).equals("A"));
        }
    }
    
}
