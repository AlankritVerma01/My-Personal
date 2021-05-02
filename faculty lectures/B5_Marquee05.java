public class B5_Marquee05
{   // Used to display a string of length 5 including a wrap arround of the given string
    public static void main(String[]args)
    {
        String s = "ABCDEFGHI"; //Taking and storing the input from the String
        for (int i = 0; i<s.length()-4 ; i++) //Generating a single substring of lenght 5
        {
            System.out.println(s.substring(i, i+5));
        }
        for (int i = s.length()-4 ; i < s.length() ; i++ ) //Generating wraparound substring of length 5
        {
            System.out.println(s.substring(i) + s.substring(0,i-4));
        }
    }    
}