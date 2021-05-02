import java.util.Scanner;

public class B6_MyCode_Marquee
{   /** Used to display a string of length 5 including a wrap arround of the given string
     *   It takes an input from the user and then displays the string in such a way that only 5 characters are shown
     *    It continues to do the iteration till the first letter of the given word becomes the first letter of the output that is the 5letter word
    */
    /** ERROR _ if the given string lenght is less than 5 then it has an error 
     */
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in); // Creating an object of Scanner
        System.out.println("Enter a sting of your choice"); // asking the user for a valid String
        String s = sc.nextLine(); //Taking and storing the input from the String
        sc.close();
        for (int i = 0; i<s.length()-4 ; i++) //Generating a single substring of lenght 5        ( s.length is 9 in trial1)
        {
            System.out.println(s.substring(i, i+5)); //This will print all the letter from  i to i+4 (i+4 included)
        }
        
        for (int i = s.length()-4 ; i < s.length() ; i++ ) // Starting the string from where it was cut in the last loop that is s.length-4=9-4=5
        {
            System.out.println(s.substring(i) + s.substring(0,i-(s.length()-5)));//Generating wraparound substring of length 5
        }
    }    
}